package org.ppke.itk.hj.interfaces;

import java.util.List;

import javax.ejb.Local;

import org.ppke.itk.hj.model.Product;

@Local
public interface ProductStatelessServiceLocal {
	
	public void addProduct(String name, Double prize);
	
	public List<Product> getProducts();

}
