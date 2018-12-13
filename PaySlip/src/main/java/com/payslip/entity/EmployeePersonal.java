package com.payslip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Model And Entity Class To Represent Employee Personal Data
 * 
 * @author nshiva
 *
 */
@Entity
public class EmployeePersonal {

	/**
	 * This To Represent Name Of The Employee
	 */
	@Column
	private String employeeName;

	/**
	 * This To Represent Id Of The Employee
	 */
	@Column
	@Id
	private Long employeeId;

	/**
	 * This To Represent Designation Of The Employee
	 */
	@Column
	private String designation;

	/**
	 * This To Represent Department Of The Employee
	 */
	@Column
	private String department;

	/**
	 * This To Represent Date Of Joining Of The Employee
	 */
	@Column
	private String dateOfJoining;

	/**
	 * This To Represent ESI Number Of The Employee
	 */
	@Column
	private String numberESI;

	/**
	 * This To Represent PF Number Of The Employee
	 */
	@Column
	private String numberPF;

	/**
	 * This To Represent UAN Number Of The Employee
	 */
	@Column
	private Long numberUAN;

	/**
	 * This To Represent PAN Number Of The Employee
	 */
	@Column
	private String numberPAN;

	/**
	 * This To Represent Billing Details Of The Employee
	 */
	@Column
	private String billing;

	/**
	 * This To Represent Work Location Of The Employee
	 */
	@Column
	private String workLocation;

	/**
	 * This Represents Bank Account Number Of The Employee
	 */
	@Column
	private Long bankAccountNo;

	/**
	 * This To Represent IFSC Code Of The Bank Of The Employee
	 */
	@Column
	private String ifscCode;

	/**
	 * This is To Represent Adhaar Number Of The Employee
	 */
	@Column
	private Long adhaarNumber;

	/**
	 * This is To Represent Permanent Address Of The Employee
	 */
	@Column
	private String PermanentAddress;

	/**
	 * This To Represent Current Address Of The Employee
	 */
	@Column
	private String currentAddress;

	/**
	 *  All Setters And Getters
	 * @return
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getNumberESI() {
		return numberESI;
	}

	public void setNumberESI(String numberESI) {
		this.numberESI = numberESI;
	}

	public String getNumberPF() {
		return numberPF;
	}

	public void setNumberPF(String numberPF) {
		this.numberPF = numberPF;
	}

	public Long getNumberUAN() {
		return numberUAN;
	}

	public void setNumberUAN(Long numberUAN) {
		this.numberUAN = numberUAN;
	}

	public String getNumberPAN() {
		return numberPAN;
	}

	public void setNumberPAN(String numberPAN) {
		this.numberPAN = numberPAN;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public Long getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(Long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Long getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(Long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getPermanentAddress() {
		return PermanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

}
