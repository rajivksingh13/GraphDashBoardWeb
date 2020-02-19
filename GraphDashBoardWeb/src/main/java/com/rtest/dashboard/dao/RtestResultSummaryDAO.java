/**
 * 
 */
package com.rtest.dashboard.dao;

import java.util.List;

import com.rtest.dashboard.entity.Rtest;

/**
 * @author rajk0517
 *
 */
public interface RtestResultSummaryDAO {
	
	List<Rtest> select(Long run_id);

}
