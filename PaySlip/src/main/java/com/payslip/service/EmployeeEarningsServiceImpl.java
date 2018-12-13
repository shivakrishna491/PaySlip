package com.payslip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.payslip.dao.EmployeeEarningsDao;
import com.payslip.entity.EmployeeEarnings;
import com.payslip.response.EarningsResponse;

/**
 * This is an Implementation Class of Interface Employee Earnings Service
 * @author nshiva
 *
 */
@Service("EmployeeEarningsService")
public class EmployeeEarningsServiceImpl implements EmployeeEarningsService {

	// Wiring Employee Earning Dao
	@Autowired
	@Qualifier("employeeEarningsDao")
	private EmployeeEarningsDao employeeEarningsDao;

	/**
	 * To Save Employee Earnings Data
	 */
	@Override
	public void saveEmployeeEarings(EmployeeEarnings earnings) {
		employeeEarningsDao.save(earnings);
	}

	/**
	 * To Delete Employee Earnings Records Based On 
	 */
	@Override
	public void deleteEmployeeEarings(Long earningsId) {
		employeeEarningsDao.deleteById(earningsId);
	}

	/**
	 * To Get All Employee Earnings data
	 */
	@Override
	public List<EmployeeEarnings> allEmployeeEarings() {
		List<EmployeeEarnings> list = new ArrayList<>();
		for (EmployeeEarnings emp : employeeEarningsDao.findAll()) {
			list.add(emp);
		}
		return list;

	}

	/**
	 * To Update Employee Earnings Data
	 */
	@Override
	public void updateEmployeeEarings(EmployeeEarnings earnings) {
		employeeEarningsDao.save(earnings);
	}

	/**
	 * To Get A Partcular Employee Earnings Structure
	 */
	@Override
	public EmployeeEarnings EmployeeEaringsStrucutre(Long earningsId) {
		return employeeEarningsDao.findByEarningsId(earningsId);
	}

	/**
	 * Service To Prepare Employee Earnings Response
	 */
	@Override
	public EarningsResponse employeeEarningsResponse(Long earningsId) {
		EmployeeEarnings earnings=EmployeeEaringsStrucutre(earningsId);
		
		Double basic=earnings.getBasic();
		Double bonus=earnings.getBonus();
		Double foddieCard=earnings.getFoddieCard();
		Double houseRentAllowance=earnings.getHouseRentAllowance();
		Double locationAllowance=earnings.getLocationAllowance();
		Double projectAllowance= earnings.getProjectAllowance();
		Double specialAllowance= earnings.getSpecialAllowance();
		
		Integer totalEarnings=(int)(basic+bonus+foddieCard+houseRentAllowance+locationAllowance+projectAllowance+specialAllowance);
		return new EarningsResponse(basic, houseRentAllowance, specialAllowance, projectAllowance, foddieCard, locationAllowance, bonus, totalEarnings);
	}

}
