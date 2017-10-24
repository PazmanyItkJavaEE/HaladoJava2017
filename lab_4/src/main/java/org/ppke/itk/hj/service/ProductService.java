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

	@PersistenceContext
	private EntityManager entityManager;
	
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
		entityManager.remove(entityManager.find(Product.class,product.getId()));
		
		
	}

	@Override
	public void updateProduct(Integer id, String name, Double price) {
		
		Product product = new Product(id, name, price);
		entityManager.merge(product);
}

	@Override
	public List<Product> getProducts() {
		TypedQuery<Product> query = entityManager.createNamedQuery(Product.getAllProducts, Product.class);
		return query.getResultList();
	}


	
	@PreDestroy
	public void preDestroy(){

	}

	


}