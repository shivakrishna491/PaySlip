package com.payslip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Model and Entity Class For Employee Deductions
 * 
 * @author nshiva
 *
 */
@Entity
@IdClass(value = EmployeeDeductions.class)
public class EmployeeDeductions implements Serializable {

	/**
	 * Serialization default version Id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * primary key column of Employee Personal.
	 */
	@Id
	@Column
	private Long employeeId;

	/**
	 * This Column To Represent Professional Tax Of The Employee
	 */
	@Column
	private Double professionalTax;

	/**
	 * This Column To Represent Project Allowance 1 Of The Employee
	 */
	@Column
	private Double projectAllowance1;

	/**
	 * This Column To Represent Foodie Card 1 Amount Of The Employee
	 */
	@Column
	private Double foodieCard1;

	/**
	 * This Column To Represent Location Allowance 1 Of The Employee
	 */
	@Column
	private Double locationAllowance1;

	/**
	 * This Column To Represent Provident Fund Of The Employee
	 */
	@Column
	private Double providentFund;

	/**
	 * This Column is To Represent Medical Insurance of The Employee
	 */
	@Column
	private Double medicalInsurance;

	/**
	 * This Represents Month And Year, primary Key
	 */

	@Id
	@Column
	private String monthAndYear;

	
	/**
	 * All Setters And Getters
	 * @return
	 */
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Double getProfessionalTax() {
		return professionalTax;
	}

	public void setProfessionalTax(Double professionalTax) {
		this.professionalTax = professionalTax;
	}

	public Double getProjectAllowance1() {
		return projectAllowance1;
	}

	public void setProjectAllowance1(Double projectAllowance1) {
		this.projectAllowance1 = projectAllowance1;
	}

	public Double getFoodieCard1() {
		return foodieCard1;
	}

	public void setFoodieCard1(Double foodieCard1) {
		this.foodieCard1 = foodieCard1;
	}

	public Double getLocationAllowance1() {
		return locationAllowance1;
	}

	public void setLocationAllowance1(Double locationAllowance1) {
		this.locationAllowance1 = locationAllowance1;
	}

	public String getMonthAndYear() {
		return monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

	public Double getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(Double medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public Double getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(Double providentFund) {
		this.providentFund = providentFund;
	}

}
