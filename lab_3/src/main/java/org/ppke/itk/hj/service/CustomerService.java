package org.ppke.itk.hj.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ppke.itk.hj.interfaces.CustomerServiceLocal;
import org.ppke.itk.hj.model.Customer;

@Stateless
public class CustomerService implements CustomerServiceLocal {
	

	
	@Override
	public Customer addCustomer(String username, String lastname, String firstname) {
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
