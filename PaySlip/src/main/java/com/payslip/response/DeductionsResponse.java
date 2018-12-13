package com.payslip.response;

/**
 * Deductions Response Object
 * 
 * @author nshiva
 *
 */
public class DeductionsResponse {

	public DeductionsResponse() {

	}

	/**
	 * Fields For Deductions Response Object
	 */
	private Long employeeId;
	private Double professionalTax;
	private Double projectAllowance1;
	private Double foodieCard1;
	private Double locationAllowance1;
	private Double providentFund;
	private Double medicalInsurance;
	private String monthAndYear;
	private Integer totalDeductions;

	/**
	 * Constructor To Create Deductions Response Object
	 * 
	 * @param employeeId
	 * @param professionalTax
	 * @param projectAllowance1
	 * @param foodieCard1
	 * @param locationAllowance1
	 * @param providentFund
	 * @param medicalInsurance
	 * @param monthAndYear
	 * @param totalDeductions
	 */
	public DeductionsResponse(Long employeeId, Double professionalTax, Double projectAllowance1, Double foodieCard1,
			Double locationAllowance1, Double providentFund, Double medicalInsurance, String monthAndYear,
			Integer totalDeductions) {
		this.employeeId = employeeId;
		this.professionalTax = professionalTax;
		this.projectAllowance1 = projectAllowance1;
		this.foodieCard1 = foodieCard1;
		this.locationAllowance1 = locationAllowance1;
		this.providentFund = providentFund;
		this.medicalInsurance = medicalInsurance;
		this.monthAndYear = monthAndYear;
		this.totalDeductions = totalDeductions;
	}

	/**
	 * Setter And Getters For All The Fields
	 * 
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

	public Double getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(Double providentFund) {
		this.providentFund = providentFund;
	}

	public Double getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(Double medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public String getMonthAndYear() {
		return monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

	public Integer getTotalDeductions() {
		return totalDeductions;
	}

	public void setTotalDeductions(Integer totalDeductions) {
		this.totalDeductions = totalDeductions;
	}

}
