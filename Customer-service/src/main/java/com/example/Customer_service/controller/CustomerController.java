package com.example.Customer_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.Customer_service.dto.PolicyDTO;
import com.example.Customer_service.dto.CustomerresponseDTO;
import com.example.Customer_service.entity.Customer;
import com.example.Customer_service.repository.CustomerRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerrepository;
	@Autowired
	private WebClient.Builder webClientBuilder;

	
	/*
	 * @PostMapping("/placeCustomer") public
	 * Mono<ResponseEntity<CustomerresponseDTO>> placeCustomer(@RequestBody Customer
	 * customer){
	 * 
	 * // Fetch policy details from admin service return
	 * webClientBuilder.build().get() .uri("http://localhost:8081/policy/{adminId}",
	 * customer.getPolicyId()) .retrieve() .bodyToMono(PolicyDTO.class)
	 * .map(policyDTO ->{ CustomerresponseDTO responseDTO = new
	 * CustomerresponseDTO();
	 * 
	 * responseDTO.setAdminId(customer.getAdminId());
	 * responseDTO.setQuantity(customer.getQuantity());
	 * 
	 * // set policy details responseDTO.setPolicyName(adminDTO.getPolicyName());
	 * responseDTO.setPolicyPrice(policyDTO.getPolicyPrice());
	 * responseDTO.setTotalPrice(customer.getQuantity() *
	 * policyDTO.getTotalPrice());
	 * 
	 * // save customer details in DB customerrepository.save(customer); return
	 * customerrepository.save(customer);
	 * responseDTO.setCustomerId(customer.getCustomerId());
	 * ResponseEntity.ok(responseDTO); });
	 * 
	 * }
	 */
	 
	 @GetMapping("/getAllCustomer")
	 public List<Customer> getAllCustomer(){
		 System.out.println("Hi hello");
		 System.out.println("Hi hello");
		 return customerrepository.findAll();
	 }
}
