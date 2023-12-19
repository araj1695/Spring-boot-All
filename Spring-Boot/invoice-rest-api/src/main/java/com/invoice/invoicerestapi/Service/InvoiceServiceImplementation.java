package com.invoice.invoicerestapi.Service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.invoicerestapi.Entity.Invoice;
import com.invoice.invoicerestapi.Exception.InvoiceNotFoundException;
import com.invoice.invoicerestapi.Repo.InvoiceRepository;
import com.invoice.invoicerestapi.Util.InvoiceUtil;

import jakarta.transaction.Transactional;

@Service
public class InvoiceServiceImplementation implements InvoiceService{

    @Autowired
    private InvoiceRepository repo;

    @Autowired
    private InvoiceUtil util;

    @Override
	public Long saveInvoice(Invoice inv) {
		util.CalculateFinalAmountIncludingGST(inv);
		Long id = repo.save(inv).getId();
		return id;
	}

    @Override
	public void updateInvoice(Invoice inv) {
		util.CalculateFinalAmountIncludingGST(inv);
		repo.save(inv);
	}

	@Override
	public void deleteInvoice(Long id) {
		Invoice inv= getOneInvoice(id);
		repo.delete(inv);
	}
	
	public Optional<Invoice> getSingleInvoice(Long Id) {
		return repo.findById(Id);
	}

	@Override
	public Invoice getOneInvoice(Long id) {

		Invoice inv = repo.findById(id)
				.orElseThrow(()->new InvoiceNotFoundException(
						new StringBuffer().append("Product  '")
						.append(id)
						.append("' not exist")
						.toString())
						);
		return inv;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		List<Invoice> list = repo.findAll();
		//JDK 1.8 List Sort (using Comparator)
				list.sort((ob1,ob2)->ob1.getId().intValue()-ob2.getId().intValue());
				//list.sort((ob1,ob2)->ob1.getAmount().compareTo(ob2.getAmount())); //ASC
				//list.sort((ob1,ob2)->ob2.getAmount().compareTo(ob1.getAmount())); // DESC
		return list;
	}
	
	@Override
	public boolean isInvoiceExist(Long id) {
		
		return repo.existsById(id);
	}
	
	@Override
	@Transactional
	public Integer updateInvoiceNumberById(
			String number, Long id) 
	{
		if(!repo.existsById(id)) { 
			throw new InvoiceNotFoundException(
					new StringBuffer()
					.append("Invoice '")
					.append(id)
					.append("' not exist")
					.toString());
		}
		return repo.updateInvoiceNumberById(number, id);
	}



    
}
