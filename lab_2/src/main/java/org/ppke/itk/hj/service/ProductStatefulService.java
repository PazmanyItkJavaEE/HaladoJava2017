package org.ppke.itk.hj.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;

import org.ppke.itk.hj.interfaces.ProductStatefulServiceLocal;
import org.ppke.itk.hj.model.Product;




@Stateful
public class ProductStatefulService implements Serializable, ProductStatefulServiceLocal {

	/**
	 * 
	 */
	//TODO megvalósítani az interfész függvényeket + annotációt elhelyezni
	
	private static final long serialVersionUID = 1597820610876007746L;
	
	List<Product> products = new ArrayList<>();
	
	@PostConstruct
	public void postConstruct(){
	   System.out.println("Stateful bean initialized");
	   products = new ArrayList<>();
	   addProduct("Huawei 10P", new Random().nextDouble());
	}
	


	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Stateful bean being destroyed");
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
