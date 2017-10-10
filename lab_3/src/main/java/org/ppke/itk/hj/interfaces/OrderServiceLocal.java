package org.ppke.itk.hj.interfaces;

import java.util.List;

import javax.ejb.Local;

import org.ppke.itk.hj.model.Order;
import org.ppke.itk.hj.model.Product;

@Local
public interface OrderServiceLocal {
	
	public void addOrder(String userName,String firstName, String lastName, List<Product> products); 
	public List<Order> getOrders();

}
