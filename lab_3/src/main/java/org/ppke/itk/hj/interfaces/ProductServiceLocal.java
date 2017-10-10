package org.ppke.itk.hj.interfaces;

import java.util.List;

import javax.ejb.Local;

import org.ppke.itk.hj.model.Product;

@Local
public interface ProductServiceLocal {
	
	public void addProduct(String name, Double prize);
	
	public void removeProduct(Product product);
	
	public void updateProduct(Integer id, String productName, Double price);
	
	public List<Product> getProducts();


}
