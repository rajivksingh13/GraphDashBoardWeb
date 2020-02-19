package com.rtest.dashboard.dao.impl;
/**
 * 
 */



import com.rtest.dashboard.dao.RtestResultDAO;
import com.rtest.dashboard.entity.RtestResult;
import com.rtest.dashboard.rowmap.RtestResultRowMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
/**
 * @author rajk0517
 *
 */
@Service
public class RtestResultDAOImpl implements RtestResultDAO{

	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	@Override
	public List<RtestResult> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RtestResult> select(Long run_id, String result) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from rtestresult where run_id=? and result=? and rownum < 50",
				new Object[] { run_id, result },
				new RtestResultRowMap());
	}
}
