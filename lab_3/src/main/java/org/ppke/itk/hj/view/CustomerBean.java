package org.ppke.itk.hj.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.ppke.itk.hj.interfaces.CustomerServiceLocal;
import org.ppke.itk.hj.model.Customer;


@Named
@SessionScoped
public class CustomerBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7557135137585151683L;
	
	@EJB
	private CustomerServiceLocal customerService;
	
	
	
	private List<Customer> customers = new ArrayList<>();
	
	
	
	public List<Customer> getCustomers() {
		customers = customerService.getCustomers();
		return customers;
	}


}
