package org.ppke.itk.hj.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ppke.itk.hj.interfaces.CustomerServiceLocal;
import org.ppke.itk.hj.model.Customer;

@Stateless
public class CustomerService implements CustomerServiceLocal {
	

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Customer addCustomer(String username, String lastname, String firstname) {
		Customer customer = new Customer();
		customer.setFirstname(firstname);
		customer.setLastname(lastname);
		customer.setUsername(username);
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
