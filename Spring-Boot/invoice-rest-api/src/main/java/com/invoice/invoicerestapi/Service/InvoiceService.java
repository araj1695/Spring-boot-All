package com.invoice.invoicerestapi.Service;

import java.util.List;

import com.invoice.invoicerestapi.Entity.Invoice;

public interface InvoiceService {

    Long saveInvoice(Invoice inv);
    void updateInvoice(Invoice e);
    void deleteInvoice(Long id);
    Invoice getOneInvoice(Long id);  //used in RestController
    List<Invoice> getAllInvoices();
    boolean isInvoiceExist(Long id);
    Integer updateInvoiceNumberById(String number,Long id);

} 
