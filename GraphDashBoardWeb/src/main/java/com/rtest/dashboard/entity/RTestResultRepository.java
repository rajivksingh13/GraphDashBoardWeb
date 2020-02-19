///**
// * 
// */
//package com.rtest.dashboard.entity;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
///**
// * @author rajk0517
// *
// */
//@Repository
//public interface RTestResultRepository extends JpaRepository<RtestJPA, String>{
//	
//	@Query(value = "select grouping(nvl(ro.silo, '(blank)')) g_silo,\r\n" + 
//			"           nvl(ro.silo, '(blank)') silo,\r\n" + 
//			"           count(*) num_tests,\r\n" + 
//			"           sum(case when rs.result = 'passed' then 1 else 0 end) passed,\r\n" + 
//			"           sum(case when rs.result = 'failed' then 1 else 0 end) failed,\r\n" + 
//			"           sum(case when rs.result = 'failed' and rc.significant_failure_boo = 'T' then 1 else 0 end) significant_failed,\r\n" + 
//			"           sum(case when rs.result = 'failed' and rc.significant_failure_boo = 'F' then 1 else 0 end) insignificant_failed,\r\n" + 
//			"           sum(case when rs.result = 'failed' and rc.test_classification = 'NA' then 1 else 0 end) unclassified_failed,\r\n" + 
//			"           sum(case when rs.result = 'failed' and rc.test_classification = 'S9' then 1 else 0 end) core_dumps,\r\n" + 
//			"           sum(rs.duration) duration\r\n" + 
//			"    from   rtestresult rs\r\n" + 
//			"    left outer join rtestowner ro on (rs.test_name = ro.test_name)\r\n" + 
//			"    left outer join rtestclassification rc on  (rs.test_classification = rc.test_classification)\r\n" + 
//			"    where  rs.run_id = ?1\r\n" + 
//			"    and    rs.excluded_boo = 'F'\r\n" + 
//			"    group by rollup(nvl(ro.silo, '(blank)'))\r\n" + 
//			"    order by nvl(ro.silo, '(blank)')", 
//			  nativeQuery = true)
//	public List<RtestJPA> findAllById(
//			   Long run_id);
//
//}
