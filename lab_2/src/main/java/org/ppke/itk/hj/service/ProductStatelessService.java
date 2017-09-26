package org.ppke.itk.hj.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;

import org.ppke.itk.hj.interfaces.ProductStatelessServiceLocal;
import org.ppke.itk.hj.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ProductStatelessService implements Serializable, ProductStatelessServiceLocal {

	private static final long serialVersionUID = -1L;
	
	List<Product> products;
	//TODO megvalósítani az interfész függvényeket + annotációt elhelyezni
	
	@PostConstruct
	public void postConstruct(){
	   System.out.println("Stateless bean initialized");
	   products = new ArrayList<>();
	   addProduct("Iphone 8", new Random().nextDouble());
	}
	


	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Stateless bean being destroyed");
	}




	@Override
	public void addProduct(String name, Double prize) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}