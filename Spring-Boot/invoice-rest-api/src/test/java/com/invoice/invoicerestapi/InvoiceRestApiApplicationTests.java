package com.invoice.invoicerestapi;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.invoice.invoicerestapi.Service.CalcService;

@SpringBootTest
class InvoiceRestApiApplicationTests {

	@Autowired
	CalcService calcService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCalcServiceAddFunctionality(){
		// CalcService calcService = new CalcService();
		int result = calcService.add(3, 4);

		assertSame(7, result);
	}

}
