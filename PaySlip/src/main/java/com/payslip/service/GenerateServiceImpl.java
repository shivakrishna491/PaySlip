package com.payslip.service;

import org.springframework.stereotype.Service;

@Service
public class GenerateServiceImpl implements GenerateService {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};

	@Override
	public  String convertNetPayIntoWords(Integer n) {
		if (n < 0) {
			return "Minus " + convertNetPayIntoWords(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convertNetPayIntoWords(n % 100);
		}

		if (n < 100000) {
			return convertNetPayIntoWords(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convertNetPayIntoWords(n % 1000);
		}

		if (n < 10000000) {
			return convertNetPayIntoWords(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convertNetPayIntoWords(n % 100000);
		}

		return convertNetPayIntoWords(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convertNetPayIntoWords(n % 10000000);
	}

	


}
