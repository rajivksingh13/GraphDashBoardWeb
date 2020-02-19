///**
// * 
// */
//package com.rtest.dashboard.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.PostLoad;
//import javax.persistence.Transient;
//
///**
// * @author rajk0517
// *
// */
//@Entity
//public class RtestJPA {
//
//	@Column(name = "g_silo")
//	private Long gSilo;
//	@Id
//	@Column(name = "silo")
//	private String siloName;
//	@Column(name = "num_tests")
//	private Long numTest;
//	@Column(name = "passed")
//	private Long passedNum;
//	@Column(name = "failed")
//	private Long failedNum;
//	@Transient
//	private Double passePct;
//	@Column(name = "significant_failed")
//	private Long significantFailed;
//	@Column(name = "insignificant_failed")
//	private Long inSignificantFailed;
//	@Column(name = "unclassified_failed")
//	private Long unClassifiedFailed;
//	@Column(name = "CORE_DUMPS")
//	private Long coreDumps;
//	@Column(name = "DURATION")
//	private Long duration;
//	
//	public RtestJPA() {
//		
//	}
//	
//	public RtestJPA(Long gSilo, String siloName, Long numTest, Long passedNum, Long failedNum, Double passePct,
//			Long significantFailed, Long inSignificantFailed, Long unClassifiedFailed, Long coreDumps, Long duration) {
//		super();
//		this.gSilo = gSilo;
//		this.siloName = siloName;
//		this.numTest = numTest;
//		this.passedNum = passedNum;
//		this.failedNum = failedNum;
//		this.passePct = passePct;
//		this.significantFailed = significantFailed;
//		this.inSignificantFailed = inSignificantFailed;
//		this.unClassifiedFailed = unClassifiedFailed;
//		this.coreDumps = coreDumps;
//		this.duration = duration;
//	}
//	public Long getgSilo() {
//		return gSilo;
//	}
//	public void setgSilo(Long gSilo) {
//		this.gSilo = gSilo;
//	}
//	public String getSiloName() {
//		return siloName;
//	}
//	public void setSiloName(String siloName) {
//		this.siloName = siloName;
//	}
//	public Long getNumTest() {
//		return numTest;
//	}
//	public void setNumTest(Long numTest) {
//		this.numTest = numTest;
//	}
//	public Long getPassedNum() {
//		return passedNum;
//	}
//	public void setPassedNum(Long passedNum) {
//		this.passedNum = passedNum;
//	}
//	public Long getFailedNum() {
//		return failedNum;
//	}
//	public void setFailedNum(Long failedNum) {
//		this.failedNum = failedNum;
//	}
//	
//	@PostLoad
//	public Double getPassePct() {
//		return passePct;
//	}
//	public void setPassePct(Double passePct) {
//		this.passePct = passePct;
//	}
//	public Long getSignificantFailed() {
//		return significantFailed;
//	}
//	public void setSignificantFailed(Long significantFailed) {
//		this.significantFailed = significantFailed;
//	}
//	public Long getInSignificantFailed() {
//		return inSignificantFailed;
//	}
//	public void setInSignificantFailed(Long inSignificantFailed) {
//		this.inSignificantFailed = inSignificantFailed;
//	}
//	public Long getUnClassifiedFailed() {
//		return unClassifiedFailed;
//	}
//	public void setUnClassifiedFailed(Long unClassifiedFailed) {
//		this.unClassifiedFailed = unClassifiedFailed;
//	}
//	public Long getCoreDumps() {
//		return coreDumps;
//	}
//	public void setCoreDumps(Long coreDumps) {
//		this.coreDumps = coreDumps;
//	}
//	public Long getDuration() {
//		return duration;
//	}
//	public void setDuration(Long duration) {
//		this.duration = duration;
//	}
//	@Override
//	public String toString() {
//		return "Rtest [gSilo=" + gSilo + ", siloName=" + siloName + ", numTest=" + numTest + ", passedNum=" + passedNum
//				+ ", failedNum=" + failedNum + ", passePct=" + passePct + ", significantFailed=" + significantFailed
//				+ ", inSignificantFailed=" + inSignificantFailed + ", unClassifiedFailed=" + unClassifiedFailed
//				+ ", coreDumps=" + coreDumps + ", duration=" + duration + "]";
//	}
//	
//	
//}
