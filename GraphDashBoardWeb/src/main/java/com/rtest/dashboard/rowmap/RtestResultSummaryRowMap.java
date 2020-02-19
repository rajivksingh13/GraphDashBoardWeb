/**
 * 
 */
package com.rtest.dashboard.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author rajk0517
 *
 */
public class RtestResultSummaryRowMap implements RowMapper{

	public Object mapRow(ResultSet rs, int line) throws SQLException {
		  RtestResultSummarySetExtractor extractor = new RtestResultSummarySetExtractor();
	    return extractor.extractData(rs);
	  }

}
