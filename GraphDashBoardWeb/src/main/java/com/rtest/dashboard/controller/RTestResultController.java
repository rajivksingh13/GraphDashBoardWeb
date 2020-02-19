/**
 * 
 */
package com.rtest.dashboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rtest.dashboard.common.NcDashboardConstants;
import com.rtest.dashboard.dao.impl.RtestResultDAOImpl;
import com.rtest.dashboard.dao.impl.RtestResultSummaryDAOImpl;
import com.rtest.dashboard.entity.RtestResult;
import com.rtest.dashboard.entity.RtestResultJPA;
import com.rtest.dashboard.rowmap.RtestResultSetExtractor;
//import com.rtest.dashboard.entity.RTestResultRepository;
import com.rtest.dashboard.entity.Rtest;
//import com.rtest.dashboard.entity.RtestJPA;
import com.rtest.dashboard.entity.RtestRepository;
//import com.rtest.dashboard.entity.RtestRepositoryCustom;

/**
 * @author rajk0517
 *
 */
@RestController
public class RTestResultController {
	
	@Autowired
	RtestRepository rtestRepository;
	
//	@Autowired
//	RTestResultRepository rtestResultRepository;
	
	@Autowired
	RtestResultDAOImpl rtestResultDAO;
	
	@Autowired
	RtestResultSetExtractor rs;
	
	@Autowired
	RtestResultSummaryDAOImpl rtestResultSummaryDAO;
	
	
	@GetMapping(NcDashboardConstants.RTEST_RESULT_REQUEST)
    public @ResponseBody List<RtestResult> getrtestResult(@PathVariable 
            Long run_id,@PathVariable 
            String result) throws Exception{
		List<RtestResult> rtestResultList = new ArrayList<>();
		rtestResultList=rtestResultDAO.select(run_id,result);
		return rtestResultList;
	}

	@GetMapping(NcDashboardConstants.RTEST_RESULT_REQUEST_JPA)
    public @ResponseBody List<RtestResultJPA> getrtestResultJPA(@PathVariable 
            Long run_id,@PathVariable 
            String result) throws Exception{
		List<RtestResultJPA> rtestResultListJPA = new ArrayList<>();
		rtestResultListJPA=rtestRepository.findAllByIdAndResult(run_id, result);
		return rtestResultListJPA;
	}
	
//	@GetMapping(NcDashboardConstants.RTEST_RESULT_REQUEST_JPA_NO_PARAM)
//    public @ResponseBody List<RtestResultJPA> getrtestResultJPA() throws Exception{
//		List<RtestResultJPA> rtestResultListJPA = new ArrayList<>();
//		rtestResultListJPA=rtestRepository.findAll();
//		return rtestResultListJPA;
//	}
	
	@GetMapping(NcDashboardConstants.RTEST_RESULT_REQUEST_JPA_PARAM)
    public @ResponseBody List<RtestResultJPA> getrtestResultRequestParam(@RequestParam(value="run_id", required=true) 
            Long run_id,@RequestParam(value="result", required=true) 
            String result) throws Exception{
		List<RtestResultJPA> rtestResultListJPA1 = new ArrayList<>();
		rtestResultListJPA1=rtestRepository.findAllByIdAndResult(run_id, result);
		return rtestResultListJPA1;
	}
	
	@GetMapping(NcDashboardConstants.RTEST_RESULT_REQUEST_NATIVE)
    public @ResponseBody List<RtestResultJPA> getrtestResultRequestNative(@RequestParam(value="run_id", required=true) 
            Long run_id,@RequestParam(value="result", required=true) 
            String result) throws Exception{
		List<RtestResultJPA> rtestResultListJPA1 = new ArrayList<>();
		rtestResultListJPA1=rtestRepository.findAllByIdAndResultNative(run_id, result);
		return rtestResultListJPA1;
	}
	
	@GetMapping(NcDashboardConstants.RTEST_RESULT_REQUEST_MAX)
    public @ResponseBody List<RtestResultJPA> getrtestResultMaxIDNative(@RequestParam(value="run_id", required=false) 
            Long run_id,@RequestParam(value="result", required=true) 
            String result) throws Exception{
		run_id=rtestRepository.findMaxRunId();
		List<RtestResultJPA> rtestResultListJPA1 = new ArrayList<>();
		rtestResultListJPA1=rtestRepository.findAllByIdAndResultNative(run_id, result);
		return rtestResultListJPA1;
	}
	
	@GetMapping(NcDashboardConstants.RTEST_RESULT_SUMMARY)
    public @ResponseBody List<Rtest> getrtestResultSummary(@RequestParam(value="run_id", required=false) 
            Long run_id) throws Exception{
		run_id=rtestRepository.findMaxRunId();
		List<Rtest> rtestResultListSummary = new ArrayList<>();
		rtestResultListSummary=rtestResultSummaryDAO.select(run_id);
		return rtestResultListSummary;
	}
	
	@RequestMapping(NcDashboardConstants.DASHBOARD_RTEST_REQUEST)
    public ModelAndView getRTest() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName(NcDashboardConstants.DASHBOARD_RTEST_VIEW);
		return mv;
	}
	
	@RequestMapping(NcDashboardConstants.DASHBOARD_RTESTPIE_REQUEST)
    public ModelAndView getRTestPie() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName(NcDashboardConstants.DASHBOARD_RTESTPIE_VIEW);
		return mv;
	}
	
//	@GetMapping(NcDashboardConstants.RTEST_RESULT_SUMMARY_JPA)
//    public @ResponseBody List<RtestJPA> getrtestResultSummaryJPA(@RequestParam(value="run_id", required=false) 
//            Long run_id) throws Exception{
//		run_id=rtestRepository.findMaxRunId();
//		List<RtestJPA> rtestResultListSummary = new ArrayList<>();
//		rtestResultListSummary=rtestResultRepository.findAllById(run_id);
//		return rtestResultListSummary;
//	}
}
