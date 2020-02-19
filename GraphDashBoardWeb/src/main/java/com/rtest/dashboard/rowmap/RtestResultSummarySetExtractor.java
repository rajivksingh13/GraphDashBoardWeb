/**
 * 
 */
package com.rtest.dashboard.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import com.rtest.dashboard.entity.Rtest;


/**
 * @author rajk0517
 *
 */
@Component
public class RtestResultSummarySetExtractor implements ResultSetExtractor{

	public Object extractData(ResultSet rs) throws SQLException {
		Rtest rtestResult = new Rtest();
	
		rtestResult.setgSilo(rs.getLong(1));
		rtestResult.setSiloName(rs.getString(2));
		rtestResult.setNumTest(rs.getLong(3));
		rtestResult.setPassedNum(rs.getLong(4));
		rtestResult.setFailedNum(rs.getLong(5));
		
		Long totalTestNumber = rtestResult.getNumTest();
		Long passedTestNumber = rtestResult.getPassedNum();
		if(rtestResult.getPassedNum() >= 0) {
			Double passPct= (double) Math.round((((double)passedTestNumber/totalTestNumber)*100));
			
			rtestResult.setPassePct(passPct);
		}

		rtestResult.setSignificantFailed(rs.getLong(6));
		rtestResult.setInSignificantFailed(rs.getLong(7));
		rtestResult.setUnClassifiedFailed(rs.getLong(8));
		rtestResult.setCoreDumps(rs.getLong(9));
		rtestResult.setDuration(rs.getLong(10));
		
		//System.out.println(rtestResult.getDuration());
		return rtestResult;
	}
}
