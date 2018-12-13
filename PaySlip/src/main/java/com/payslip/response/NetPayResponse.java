package com.payslip.response;

/**
 * NetPay Response Object
 * @author nshiva
 *
 */
public class NetPayResponse {

	/**
	 * Fields Of NetPay Response Object
	 */
	private Integer netpay;
	private String amountInWords;
	private String modeOfPayment;
	private Integer totalNetPayable;

	/**
	 * Constructor To Create NetPay Response Object
	 * @param netpay
	 * @param amountInWords
	 * @param modeOfPayment
	 * @param totalNetPayable
	 */
	public NetPayResponse(Integer netpay, String amountInWords, String modeOfPayment, Integer totalNetPayable) {
		super();
		this.netpay = netpay;
		this.amountInWords = amountInWords;
		this.modeOfPayment = modeOfPayment;
		this.totalNetPayable = totalNetPayable;
	}

	/**
	 *  Setters And Getter For All Fields
	 * @return
	 */
	public Integer getNetpay() {
		return netpay;
	}

	public void setNetpay(Integer netpay) {
		this.netpay = netpay;
	}

	public String getAmountInWords() {
		return amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Integer getTotalNetPayable() {
		return totalNetPayable;
	}

	public void setTotalNetPayable(Integer totalNetPayable) {
		this.totalNetPayable = totalNetPayable;
	}

}