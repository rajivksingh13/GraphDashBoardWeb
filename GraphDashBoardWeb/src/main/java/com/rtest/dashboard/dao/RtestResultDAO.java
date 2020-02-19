/**
 * 
 */
package com.rtest.dashboard.dao;

import java.util.List;
import javax.sql.DataSource;

import com.rtest.dashboard.entity.RtestResult;


/**
 * @author rajk0517
 *
 */
public interface RtestResultDAO {

	  List<RtestResult> select(Long run_id, String result);

	  List<RtestResult> selectAll();
	  
}
