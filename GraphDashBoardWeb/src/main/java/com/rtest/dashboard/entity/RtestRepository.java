/**
 * 
 */
package com.rtest.dashboard.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author rajk0517
 *
 */
//@Repository
public interface RtestRepository extends JpaRepository<RtestResultJPA, Long>, RtestRepositoryCustom{
		 
	@Query(value = "select max(run_id) from rtestresult", 
			  nativeQuery = true)
	public Long findMaxRunId(); 
	 
	@Query(value = "select * from rtestresult where run_id=?1 and result=?2 and rownum < 10", 
			  nativeQuery = true)
	public List<RtestResultJPA> findAllByIdAndResultNative(
			   Long run_id, String result); 

}
