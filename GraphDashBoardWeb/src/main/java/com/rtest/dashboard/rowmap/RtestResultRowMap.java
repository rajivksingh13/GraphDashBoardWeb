/**
 * 
 */
package com.rtest.dashboard.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author 172661
 *
 */
public class RtestResultRowMap implements RowMapper {

	  public Object mapRow(ResultSet rs, int line) throws SQLException {
		  RtestResultSetExtractor extractor = new RtestResultSetExtractor();
	    return extractor.extractData(rs);
	  }

}
