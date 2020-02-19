/**
 * 
 */
package com.rtest.dashboard.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author rajk0517
 *
 */
@Repository
public class RtestRepositoryImpl implements RtestRepositoryCustom{

	private EntityManager em;

    public RtestRepositoryImpl(EntityManager em) {
        this.em = em;
    }
	
	@Override
	public List<RtestResultJPA> findAllByIdAndResult(Long run_id, String result) {
		// TODO Auto-generated method stub
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<RtestResultJPA> cq = cb.createQuery(RtestResultJPA.class);
        
        Root<RtestResultJPA> RtestResultJPA = cq.from(RtestResultJPA.class);
        List<Predicate> predicates = new ArrayList<>();

        if (run_id != null) {
            predicates.add(cb.equal(RtestResultJPA.get("runID"), run_id));
        }
        if (result != null) {
            predicates.add(cb.like(RtestResultJPA.get("result"), "%" + result + "%"));
        }
        cq.where(predicates.toArray(new Predicate[0]));

        TypedQuery<RtestResultJPA> query = em.createQuery(cq);
        return query.getResultList().subList(0, 10);
	}
	
}
