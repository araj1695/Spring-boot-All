package com.invoice.invoicerestapi.Exception;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.invoice.invoicerestapi.Entity.ErrorType;

public class InvoiceErrorHandler {

    @ExceptionHandler(InvoiceNotFoundException.class)
	public ResponseEntity<ErrorType> handleNotFound(InvoiceNotFoundException nfe){
		
		return new ResponseEntity<ErrorType>(new ErrorType(new Date(System.currentTimeMillis()).toString(), "404- NOT FOUND", nfe.getMessage()), HttpStatus.NOT_FOUND);
	}
    
}
