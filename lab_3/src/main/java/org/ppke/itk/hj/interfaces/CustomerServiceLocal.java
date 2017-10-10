package org.ppke.itk.hj.interfaces;

import java.util.List;

import javax.ejb.Local;

import org.ppke.itk.hj.model.Customer;

@Local
public interface CustomerServiceLocal {
	
	public List<Customer> getCustomers();

	Customer addCustomer(String username, String lastname, String firstname);

}
