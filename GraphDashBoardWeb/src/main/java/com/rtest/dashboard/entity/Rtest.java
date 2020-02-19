/**
 * 
 */
package com.rtest.dashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rajk0517
 *
 */

public class Rtest {

	private Long gSilo;
	private String siloName;
	private Long numTest;
	private Long passedNum;
	private Long failedNum;
	private Double passePct;
	private Long significantFailed;
	private Long inSignificantFailed;
	private Long unClassifiedFailed;
	private Long coreDumps;
	private Long duration;
	
	public Rtest() {
		
	}
	
	public Rtest(Long gSilo, String siloName, Long numTest, Long passedNum, Long failedNum, Double passePct,
			Long significantFailed, Long inSignificantFailed, Long unClassifiedFailed, Long coreDumps, Long duration) {
		super();
		this.gSilo = gSilo;
		this.siloName = siloName;
		this.numTest = numTest;
		this.passedNum = passedNum;
		this.failedNum = failedNum;
		this.passePct = passePct;
		this.significantFailed = significantFailed;
		this.inSignificantFailed = inSignificantFailed;
		this.unClassifiedFailed = unClassifiedFailed;
		this.coreDumps = coreDumps;
		this.duration = duration;
	}
	public Long getgSilo() {
		return gSilo;
	}
	public void setgSilo(Long gSilo) {
		this.gSilo = gSilo;
	}
	public String getSiloName() {
		return siloName;
	}
	public void setSiloName(String siloName) {
		this.siloName = siloName;
	}
	public Long getNumTest() {
		return numTest;
	}
	public void setNumTest(Long numTest) {
		this.numTest = numTest;
	}
	public Long getPassedNum() {
		return passedNum;
	}
	public void setPassedNum(Long passedNum) {
		this.passedNum = passedNum;
	}
	public Long getFailedNum() {
		return failedNum;
	}
	public void setFailedNum(Long failedNum) {
		this.failedNum = failedNum;
	}
	public Double getPassePct() {
		return passePct;
	}
	public void setPassePct(Double passePct) {
		this.passePct = passePct;
	}
	public Long getSignificantFailed() {
		return significantFailed;
	}
	public void setSignificantFailed(Long significantFailed) {
		this.significantFailed = significantFailed;
	}
	public Long getInSignificantFailed() {
		return inSignificantFailed;
	}
	public void setInSignificantFailed(Long inSignificantFailed) {
		this.inSignificantFailed = inSignificantFailed;
	}
	public Long getUnClassifiedFailed() {
		return unClassifiedFailed;
	}
	public void setUnClassifiedFailed(Long unClassifiedFailed) {
		this.unClassifiedFailed = unClassifiedFailed;
	}
	public Long getCoreDumps() {
		return coreDumps;
	}
	public void setCoreDumps(Long coreDumps) {
		this.coreDumps = coreDumps;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Rtest [gSilo=" + gSilo + ", siloName=" + siloName + ", numTest=" + numTest + ", passedNum=" + passedNum
				+ ", failedNum=" + failedNum + ", passePct=" + passePct + ", significantFailed=" + significantFailed
				+ ", inSignificantFailed=" + inSignificantFailed + ", unClassifiedFailed=" + unClassifiedFailed
				+ ", coreDumps=" + coreDumps + ", duration=" + duration + "]";
	}
	
	
}
