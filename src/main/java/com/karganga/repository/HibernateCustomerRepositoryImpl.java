package com.karganga.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.karganga.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {

		List<Customer> customerList = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Rahul");

		customer.setLastName("Karale");

		customerList.add(customer);

		return customerList;
	}

}
