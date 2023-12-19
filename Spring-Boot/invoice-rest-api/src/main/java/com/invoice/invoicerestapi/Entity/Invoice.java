package com.invoice.invoicerestapi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Invoice {

    @Id
	@GeneratedValue
	private Long id;
	private String name;
	private Double amount;
	private Double finalAmount;
	private String number;
	private String receivedDate;
	private String type;
	private String vendor;
	private String comments;
    
}
