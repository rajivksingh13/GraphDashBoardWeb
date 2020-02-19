/**
 * 
 */
package com.rtest.dashboard.entity;

import java.util.Date;
import org.springframework.stereotype.Component;

/**
 * @author rajk0517
 *
 */
@Component

public class RtestResult {
	
	private Long runID;
	
	private String testName;
	
	private Date startDTM;
	
	private Date endDTM;
	
	private Long duration;
	
	private String result;
	
	private Long testStatus;
	
	private String testClassification;
	
	private String classificationOwner;
	
	private Date testFixDTM;
	
	private String testFailureNote;
	
	private String resultFile;
	
	private String fixedBoo;
	
	private String fixedAssignedTo;
	
	private Long fixedTask;
	
	private Date fixedAssignedDTM;
	
	private String fixedAssignedEmail;
	
	private String diffHash;
	
	private String excludedBoo;
	
	private String moduleDir;
	
	private String diffFile;
	
	private String goodFile;
	
	private String testOutPut;

	private String loadLog;
	
	public RtestResult() {
		
	}
	public RtestResult(Long runID, String testName, Date startDTM, Date endDTM, Long duration, String result,
			Long testStatus, String testClassification, String classificationOwner, Date testFixDTM,
			String testFailureNote, String resultFile, String fixedBoo, String fixedAssignedTo, Long fixedTask,
			Date fixedAssignedDTM, String fixedAssignedEmail, String diffHash, String excludedBoo, String moduleDir,
			String diffFile, String goodFile, String testOutPut, String loadLog) {
		super();
		this.runID = runID;
		this.testName = testName;
		this.startDTM = startDTM;
		this.endDTM = endDTM;
		this.duration = duration;
		this.result = result;
		this.testStatus = testStatus;
		this.testClassification = testClassification;
		this.classificationOwner = classificationOwner;
		this.testFixDTM = testFixDTM;
		this.testFailureNote = testFailureNote;
		this.resultFile = resultFile;
		this.fixedBoo = fixedBoo;
		this.fixedAssignedTo = fixedAssignedTo;
		this.fixedTask = fixedTask;
		this.fixedAssignedDTM = fixedAssignedDTM;
		this.fixedAssignedEmail = fixedAssignedEmail;
		this.diffHash = diffHash;
		this.excludedBoo = excludedBoo;
		this.moduleDir = moduleDir;
		this.diffFile = diffFile;
		this.goodFile = goodFile;
		this.testOutPut = testOutPut;
		this.loadLog = loadLog;
	}
	public Long getRunID() {
		return runID;
	}
	public void setRunID(Long runID) {
		this.runID = runID;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Date getStartDTM() {
		return startDTM;
	}
	public void setStartDTM(Date startDTM) {
		this.startDTM = startDTM;
	}
	public Date getEndDTM() {
		return endDTM;
	}
	public void setEndDTM(Date endDTM) {
		this.endDTM = endDTM;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Long getTestStatus() {
		return testStatus;
	}
	public void setTestStatus(Long testStatus) {
		this.testStatus = testStatus;
	}
	public String getTestClassification() {
		return testClassification;
	}
	public void setTestClassification(String testClassification) {
		this.testClassification = testClassification;
	}
	public String getClassificationOwner() {
		return classificationOwner;
	}
	public void setClassificationOwner(String classificationOwner) {
		this.classificationOwner = classificationOwner;
	}
	public Date getTestFixDTM() {
		return testFixDTM;
	}
	public void setTestFixDTM(Date testFixDTM) {
		this.testFixDTM = testFixDTM;
	}
	public String getTestFailureNote() {
		return testFailureNote;
	}
	public void setTestFailureNote(String testFailureNote) {
		this.testFailureNote = testFailureNote;
	}
	public String getResultFile() {
		return resultFile;
	}
	public void setResultFile(String resultFile) {
		this.resultFile = resultFile;
	}
	public String getFixedBoo() {
		return fixedBoo;
	}
	public void setFixedBoo(String fixedBoo) {
		this.fixedBoo = fixedBoo;
	}
	public String getFixedAssignedTo() {
		return fixedAssignedTo;
	}
	public void setFixedAssignedTo(String fixedAssignedTo) {
		this.fixedAssignedTo = fixedAssignedTo;
	}
	public Long getFixedTask() {
		return fixedTask;
	}
	public void setFixedTask(Long fixedTask) {
		this.fixedTask = fixedTask;
	}
	public Date getFixedAssignedDTM() {
		return fixedAssignedDTM;
	}
	public void setFixedAssignedDTM(Date fixedAssignedDTM) {
		this.fixedAssignedDTM = fixedAssignedDTM;
	}
	public String getFixedAssignedEmail() {
		return fixedAssignedEmail;
	}
	public void setFixedAssignedEmail(String fixedAssignedEmail) {
		this.fixedAssignedEmail = fixedAssignedEmail;
	}
	public String getDiffHash() {
		return diffHash;
	}
	public void setDiffHash(String diffHash) {
		this.diffHash = diffHash;
	}
	public String getExcludedBoo() {
		return excludedBoo;
	}
	public void setExcludedBoo(String excludedBoo) {
		this.excludedBoo = excludedBoo;
	}
	public String getModuleDir() {
		return moduleDir;
	}
	public void setModuleDir(String moduleDir) {
		this.moduleDir = moduleDir;
	}
	public String getDiffFile() {
		return diffFile;
	}
	public void setDiffFile(String diffFile) {
		this.diffFile = diffFile;
	}
	public String getGoodFile() {
		return goodFile;
	}
	public void setGoodFile(String goodFile) {
		this.goodFile = goodFile;
	}
	public String getTestOutPut() {
		return testOutPut;
	}
	public void setTestOutPut(String testOutPut) {
		this.testOutPut = testOutPut;
	}
	public String getLoadLog() {
		return loadLog;
	}
	public void setLoadLog(String loadLog) {
		this.loadLog = loadLog;
	}
	@Override
	public String toString() {
		return "RtestResult [runID=" + runID + ", testName=" + testName + ", startDTM=" + startDTM + ", endDTM="
				+ endDTM + ", duration=" + duration + ", result=" + result + ", testStatus=" + testStatus
				+ ", testClassification=" + testClassification + ", classificationOwner=" + classificationOwner
				+ ", testFixDTM=" + testFixDTM + ", testFailureNote=" + testFailureNote + ", resultFile=" + resultFile
				+ ", fixedBoo=" + fixedBoo + ", fixedAssignedTo=" + fixedAssignedTo + ", fixedTask=" + fixedTask
				+ ", fixedAssignedDTM=" + fixedAssignedDTM + ", fixedAssignedEmail=" + fixedAssignedEmail
				+ ", diffHash=" + diffHash + ", excludedBoo=" + excludedBoo + ", moduleDir=" + moduleDir + ", diffFile="
				+ diffFile + ", goodFile=" + goodFile + ", testOutPut=" + testOutPut + ", loadLog=" + loadLog + "]";
	}

}
