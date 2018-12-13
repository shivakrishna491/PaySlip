package com.payslip.service;

import org.springframework.stereotype.Service;

@Service
public interface GenerateService {

	String convertNetPayIntoWords(Integer netPay);

}
