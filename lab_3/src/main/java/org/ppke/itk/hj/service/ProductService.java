package org.ppke.itk.hj.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.ppke.itk.hj.interfaces.ProductServiceLocal;
import org.ppke.itk.hj.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ProductService implements Serializable, ProductServiceLocal {

	private static final long serialVersionUID = -1L;

	
	@PostConstruct
	public void postConstruct(){

	}

	@Override
	public void addProduct(String name, Double prize) {
		
		Product product = new Product(name, prize);
		entityManager.persist(product);
		
		
	}
	

	@Override
	public void removeProduct(Product product) {
		
		
	}

	@Override
	public void updateProduct(Integer id, String name, Double price) {
		
	}

	@Override
	public List<Product> getProducts() {
		TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p", Product.class);
		return query.getResultList();
	}


	
	@PreDestroy
	public void preDestroy(){

	}

	


}