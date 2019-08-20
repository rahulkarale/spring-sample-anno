package com.karganga.repository;

import java.util.List;

import com.karganga.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}