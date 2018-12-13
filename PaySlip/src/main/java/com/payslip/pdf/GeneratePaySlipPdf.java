package com.payslip.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.payslip.response.PaySlipResponse;

/**
 * This Class Helps To Generate PDF file
 * 
 * @author nshiva
 *
 */
public class GeneratePaySlipPdf {

	public static ByteArrayInputStream generatePaySlipPdf(PaySlipResponse paySlipResponse) throws DocumentException {

		/**
		 * Creating Document Object And Byte Array Output Stream
		 */
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		/**
		 *  Creating Pdf Table for Personal data With Two Column
		 */
		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(100);

		/**
		 *  Setting FontStyle and Font Size
		 */
		Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		headFont.setSize(14);
		Font BodyFont = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		BodyFont.setSize(14);

		/** 
		 * Creating Pdf Cell Object for Pdf Table
		 */
		PdfPCell PersonalCell1;
		PdfPCell PersonalCell2;

		PersonalCell1 = new PdfPCell(
				new Phrase("Employee Name : " + paySlipResponse.getPersonalResponse().getEmployeeName()
						+ "\nEmployee Id : " + paySlipResponse.getPersonalResponse().getEmployeeId()
						+ "\nDesignation : " + paySlipResponse.getPersonalResponse().getDesignation()
						+ "\nDepartment : " + paySlipResponse.getPersonalResponse().getDepartment()
						+ "\nDate Of Joining : " + paySlipResponse.getPersonalResponse().getDateOfJoining()
						+ "\nESI Number: " + paySlipResponse.getPersonalResponse().getNumberESI()

				));

		PersonalCell1.setVerticalAlignment(Element.ALIGN_LEFT);

		PersonalCell2 = new PdfPCell(new Phrase("PF No : " + paySlipResponse.getPersonalResponse().getNumberPF()
				+ "\nUAN : " + paySlipResponse.getPersonalResponse().getNumberUAN() + "\nWork Location : "
				+ paySlipResponse.getPersonalResponse().getWorkLocation() + "\nLOP Days : "
				+ paySlipResponse.getPersonalResponse().getLossOfPayDays() + "\nWorked Days : "
				+ paySlipResponse.getPersonalResponse().getWorkingdays() + "\nBank A/c No : "
				+ paySlipResponse.getPersonalResponse().getBankAccountNo()

		));

		PersonalCell2.setVerticalAlignment(Element.ALIGN_LEFT);

		/**
		 *  Adding Pdf Cells to PDF Table
		 */
		table.addCell(PersonalCell1);
		table.addCell(PersonalCell2);

		// Setting Spacing After Table Printing
		table.setSpacingAfter(5);

		/**
		 * Creating Pdf Table for Earnings And Deductions data With Two Column
		 */
		PdfPTable table1 = new PdfPTable(2);
		table1.setWidthPercentage(100);

		/**
		 * PDF Cells
		 */
		PdfPCell EarningsCell;
		PdfPCell deductionsCell;

		EarningsCell = new PdfPCell(new Phrase(

				"BASIC : " + paySlipResponse.getEarningsResponse().getBasic() + "\nHouse Rent Allowance : "
						+ paySlipResponse.getEarningsResponse().getHouseRentAllowance() + "\nSpecial Allowance : "
						+ paySlipResponse.getEarningsResponse().getSpecialAllowance() + "\nProject Allowance : "
						+ paySlipResponse.getEarningsResponse().getProjectAllowance() + "\nFoodie Card : "
						+ paySlipResponse.getEarningsResponse().getFoddieCard() + "\nLocation Allowance : "
						+ paySlipResponse.getEarningsResponse().getLocationAllowance() + "\nBonus : "
						+ paySlipResponse.getEarningsResponse().getBonus() + "\nTotal Earnings : "
						+ paySlipResponse.getEarningsResponse().getTotalEarnings()

		));

		deductionsCell = new PdfPCell(
				new Phrase("Profession Tax : " + paySlipResponse.getDeductionsResponse().getProfessionalTax()
						+ "\nProject Allowance 1 : " + paySlipResponse.getDeductionsResponse().getProjectAllowance1()
						+ "\nFoddie Card 1 : " + paySlipResponse.getDeductionsResponse().getFoodieCard1()
						+ "\nLocation Allowance : " + paySlipResponse.getDeductionsResponse().getLocationAllowance1()
						+ "\nProvident Fund : " + paySlipResponse.getDeductionsResponse().getProvidentFund()
						+ "\nTotal Deductions : " + paySlipResponse.getDeductionsResponse().getTotalDeductions()

				));

		/**
		 * Adding PDF Cells To Pdf Table
		 */
		table1.addCell(EarningsCell);
		table1.addCell(deductionsCell);

		/**
		 * Creating PDF Table With One column
		 */
		PdfPTable table3 = new PdfPTable(1);
		table3.setWidthPercentage(100);
		
		/**
		 * PDF Cell
		 */
		PdfPCell netPayCell;

		netPayCell = new PdfPCell(new Phrase("NetPay : " + paySlipResponse.getNetPayResponse().getNetpay().toString()
				+ "\nAmount In Words : " + paySlipResponse.getNetPayResponse().getAmountInWords().toString()
				+ "\nMode Of Payment : " + paySlipResponse.getNetPayResponse().getModeOfPayment().toString()
				+ "\nTotal Net Payable Amount" + paySlipResponse.getNetPayResponse().getTotalNetPayable().toString()));
		netPayCell.setVerticalAlignment(Element.ALIGN_LEFT);
		
		/**
		 *  Adding PDF Cell to Table
		 */
		table3.addCell(netPayCell);

		/**
		 * Use this method to get an instance of the PdfWriter
		 */
		PdfWriter.getInstance(document, out);
		
		document.open();

		/**
		 * Adds an Element(Table) to the Document
		 */
		document.add(table);
		document.add(table1);
		document.add(table3);

		document.close();

		return new ByteArrayInputStream(out.toByteArray());

	}
}
