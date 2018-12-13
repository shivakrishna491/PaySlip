package com.payslip.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.payslip.entity.EmployeeEarnings;

/**
 * To Manipulate Employee Earnings
 * @author nshiva
 *
 */
@Transactional
@Repository
public interface EmployeeEarningsDao extends CrudRepository<EmployeeEarnings, Long>{

	/**
	 * Finds Employee Earnings Records by Earnings Id
	 * @param earningsId
	 * @return EmployeeEarnings
	 */
	public EmployeeEarnings findByEarningsId(Long earningsId);
}
