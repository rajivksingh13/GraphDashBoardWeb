package com.rtest.dashboard.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.rtest.dashboard.entity.RtestResult;

/**
 * @author 172661
 *
 */
@Component
public class RtestResultSetExtractor implements ResultSetExtractor {

	public Object extractData(ResultSet rs) throws SQLException {
		RtestResult rtestResult = new RtestResult();
	
		rtestResult.setRunID(rs.getLong(1));
		rtestResult.setTestName(rs.getString(2));
		rtestResult.setStartDTM(rs.getDate(3));
		rtestResult.setEndDTM(rs.getDate(4));
		rtestResult.setDuration(rs.getLong(5));
		rtestResult.setResult(rs.getString(6));
		rtestResult.setTestStatus(rs.getLong(7));
		rtestResult.setTestClassification(rs.getString(8));
		rtestResult.setClassificationOwner(rs.getString(9));
		rtestResult.setTestFixDTM(rs.getDate(10));
		rtestResult.setTestFailureNote(rs.getString(11));
		rtestResult.setResultFile(rs.getString(12));
		rtestResult.setFixedBoo(rs.getString(13));
		rtestResult.setFixedAssignedTo(rs.getString(14));
		rtestResult.setFixedTask(rs.getLong(15));
		rtestResult.setFixedAssignedDTM(rs.getDate(16));
		rtestResult.setFixedAssignedEmail(rs.getString(17));
		rtestResult.setDiffHash(rs.getString(18));
		rtestResult.setExcludedBoo(rs.getString(19));
		rtestResult.setModuleDir(rs.getString(20));
		rtestResult.setDiffFile(rs.getString(21));
		rtestResult.setGoodFile(rs.getString(22));
		rtestResult.setTestOutPut(rs.getString(23));
		rtestResult.setLoadLog(rs.getString(24));
		

		return rtestResult;
	}

}
