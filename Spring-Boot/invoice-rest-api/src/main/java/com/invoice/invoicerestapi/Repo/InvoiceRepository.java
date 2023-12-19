package com.invoice.invoicerestapi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invoice.invoicerestapi.Entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{  
    
    @Query("UPDATE Invoice SET number=:number WHERE id=:id")
	Integer updateInvoiceNumberById(String number,Long id);
} 
