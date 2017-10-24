package org.ppke.itk.hj.interfaces;

import java.util.List;

import javax.ejb.Local;

import org.ppke.itk.hj.model.Customer;
import org.ppke.itk.hj.model.Role;

@Local
public interface CustomerServiceLocal {
	
	public List<Customer> getCustomers();

	Customer addCustomer(String username, String lastname, String firstname);

	void addCustomer(String userName, String lastName, String firstName, String password, String role);

	void updateCustomer(Integer id, String userName, String lastName, String firstName, String password, String role);

}
