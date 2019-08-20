package com.karganga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karganga.model.Customer;
import com.karganga.repository.CustomerRepository;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
	
		System.out.println("we are using constructor injuction");
		this.customerRepository = customerRepository;
	}
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using seeter injuction");
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
