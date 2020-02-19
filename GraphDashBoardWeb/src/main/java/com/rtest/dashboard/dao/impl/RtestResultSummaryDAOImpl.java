/**
 * 
 */
package com.rtest.dashboard.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.rtest.dashboard.dao.RtestResultSummaryDAO;
import com.rtest.dashboard.entity.Rtest;
import com.rtest.dashboard.rowmap.RtestResultSummaryRowMap;

/**
 * @author rajk0517
 *
 */
@Service
public class RtestResultSummaryDAOImpl implements RtestResultSummaryDAO{
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Rtest> select(Long run_id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select grouping(nvl(ro.silo, '(blank)')) g_silo,\r\n" + 
				"           nvl(ro.silo, '(blank)') silo,\r\n" + 
				"           count(*) num_tests,\r\n" + 
				"           sum(case when rs.result = 'passed' then 1 else 0 end) passed,\r\n" + 
				"           sum(case when rs.result = 'failed' then 1 else 0 end) failed,\r\n" + 
				"           sum(case when rs.result = 'failed' and rc.significant_failure_boo = 'T' then 1 else 0 end) significant_failed,\r\n" + 
				"           sum(case when rs.result = 'failed' and rc.significant_failure_boo = 'F' then 1 else 0 end) insignificant_failed,\r\n" + 
				"           sum(case when rs.result = 'failed' and rc.test_classification = 'NA' then 1 else 0 end) unclassified_failed,\r\n" + 
				"           sum(case when rs.result = 'failed' and rc.test_classification = 'S9' then 1 else 0 end) core_dumps,\r\n" + 
				"           sum(rs.duration) duration\r\n" + 
				"    from   rtestresult rs\r\n" + 
				"    left outer join rtestowner ro on (rs.test_name = ro.test_name)\r\n" + 
				"    left outer join rtestclassification rc on  (rs.test_classification = rc.test_classification)\r\n" + 
				"    where  rs.run_id = ?\r\n" + 
				"    and    rs.excluded_boo = 'F'\r\n" + 
				"    group by rollup(nvl(ro.silo, '(blank)'))\r\n" + 
				"    order by nvl(ro.silo, '(blank)')",
				new Object[] { run_id },
				new RtestResultSummaryRowMap());
	}

}
