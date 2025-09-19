package com.example.Customer_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerresponseDTO {

	private Long customerId;
	private Long policyId;
	private Integer quantity;
	private Double totalPrice;
	//policy details
	
	private String policyName;
	private Double policyPrice;
	
}
