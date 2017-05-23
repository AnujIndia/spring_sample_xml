package com.pularsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pularsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pularsight.repository.CustomerRepository#findAll()
	 */
	@Value("${dbUserName}")
	private String dbUserName;
	
	/*public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}*/

	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<Customer>();
		Customer customer1 = new Customer();
		customer1.setFirstName("Nishi");
		customer1.setLastName(" Saxena");

		customers.add(customer1);
		
		System.out.println("Printing the DB user from Properties Files -" + dbUserName);
		return customers;

	}

}
