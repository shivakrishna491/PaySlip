package com.payslip.response;

/**
 * Personal Data Response Object
 * @author nshiva
 *
 */
public class PersonalResponse {

	/**
	 * Fields Of Personal Data Response Object
	 */
	private Long employeeId;
	private String employeeName;
	private String designation;
	private String department;
	private String numberESI;
	private String numberPF;
	private Long numberUAN;
	private String numberPAN;
	private Long bankAccountNo;
	private Double lossOfPayDays;
	private Double workingdays;
	private String dateOfJoining;
	private String workLocation;
	

	/**
	 * Constructor to Create Personal Data Response Object
	 * @param employeeId
	 * @param employeeName
	 * @param designation
	 * @param department
	 * @param numberESI
	 * @param numberPF
	 * @param numberUAN
	 * @param numberPAN
	 * @param bankAccountNo
	 * @param lossOfPayDays
	 * @param workingdays
	 * @param dateOfJoining
	 * @param workLocation
	 */
	public PersonalResponse(Long employeeId, String employeeName, String designation, String department,
			String numberESI, String numberPF, Long numberUAN, String numberPAN, Long bankAccountNo,
			Double lossOfPayDays, Double workingdays, String dateOfJoining, String workLocation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
		this.numberESI = numberESI;
		this.numberPF = numberPF;
		this.numberUAN = numberUAN;
		this.numberPAN = numberPAN;
		this.bankAccountNo = bankAccountNo;
		this.lossOfPayDays = lossOfPayDays;
		this.workingdays = workingdays;
		this.dateOfJoining = dateOfJoining;
		this.workLocation = workLocation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	
	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public Long getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(Long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public Double getLossOfPayDays() {
		return lossOfPayDays;
	}

	public void setLossOfPayDays(Double lossOfPayDays) {
		this.lossOfPayDays = lossOfPayDays;
	}

	public Double getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(Double workingdays) {
		this.workingdays = workingdays;
	}
}
