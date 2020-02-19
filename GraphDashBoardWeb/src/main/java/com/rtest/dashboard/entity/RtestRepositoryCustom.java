package com.rtest.dashboard.entity;

import java.util.List;

public interface RtestRepositoryCustom {
	 List<RtestResultJPA> findAllByIdAndResult(Long run_id,String result);
	 //List<RtestResultJPA> findAllByIdAndResultNative(Long run_id,String result);
}
