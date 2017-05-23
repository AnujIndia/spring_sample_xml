package com.pularsight.service;

import java.util.List;

import com.pularsight.model.Customer;
import com.pularsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;
	
	

	public CustomerServiceImpl() {
		super();
	}
	
	

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}



	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pularsight.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
