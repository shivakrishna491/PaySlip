package com.payslip.response;

/**
 * PaySlip Response Object 
 * @author nshiva
 *
 */
public class PaySlipResponse {

	/**
	 * All Fields Of PaySlip Response Object 
	 */
	private DeductionsResponse deductionsResponse;
	private EarningsResponse earningsResponse;
	private NetPayResponse netPayResponse;
	private PersonalResponse personalResponse;

	/**
	 * Constructor To Create  PaySlip Response Object 
	 * @param deductionsResponse
	 * @param earningsResponse
	 * @param netPayResponse
	 * @param personalResponse
	 */
	public PaySlipResponse(DeductionsResponse deductionsResponse, EarningsResponse earningsResponse,
			NetPayResponse netPayResponse, PersonalResponse personalResponse) {
		super();
		this.deductionsResponse = deductionsResponse;
		this.earningsResponse = earningsResponse;
		this.netPayResponse = netPayResponse;
		this.personalResponse = personalResponse;
	}

	/**
	 * All Fields Setters And Getters
	 * @return
	 */
	public DeductionsResponse getDeductionsResponse() {
		return deductionsResponse;
	}

	public void setDeductionsResponse(DeductionsResponse deductionsResponse) {
		this.deductionsResponse = deductionsResponse;
	}

	public EarningsResponse getEarningsResponse() {
		return earningsResponse;
	}

	public void setEarningsResponse(EarningsResponse earningsResponse) {
		this.earningsResponse = earningsResponse;
	}

	public NetPayResponse getNetPayResponse() {
		return netPayResponse;
	}

	public void setNetPayResponse(NetPayResponse netPayResponse) {
		this.netPayResponse = netPayResponse;
	}

	public PersonalResponse getPersonalResponse() {
		return personalResponse;
	}

	public void setPersonalResponse(PersonalResponse personalResponse) {
		this.personalResponse = personalResponse;
	}
 }
