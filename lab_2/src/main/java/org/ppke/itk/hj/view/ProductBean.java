package org.ppke.itk.hj.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.ppke.itk.hj.interfaces.ProductStatefulServiceLocal;
import org.ppke.itk.hj.interfaces.ProductStatelessServiceLocal;
import org.ppke.itk.hj.model.Product;

/**
 * Backing bean for Product entities.
 * <p/>
 * This class provides CRUD functionality for all Product entities. It focuses
 * purely on Java EE 6 standards (e.g. <tt>&#64;ConversationScoped</tt> for
 * state management, <tt>PersistenceContext</tt> for persistence,
 * <tt>CriteriaBuilder</tt> for searches) rather than introducing a CRUD framework or
 * custom base class.
 */

@Named
@SessionScoped
public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * Support creating and retrieving Product entities
	 */
    @EJB
    private ProductStatelessServiceLocal statelessService;
    
    @EJB
    private ProductStatefulServiceLocal statefulService;
    
    private List<Product> productListStateful ;
    private List<Product> productListStateless ;
    
    private Product product = new Product();
    
    public String create() {
		return "create?faces-redirect=true";
	}

	
//	public void getAll() {
//		productListStateful = statefulService.getProducts();
//		productListStateless = statelessService.getProducts();
//
//	}
	
	public void addStateful(){
		statefulService.addProduct(product.getProductName(), product.getPrice());
		productListStateful = statefulService.getProducts();

	}
	
	public void addStateless(){
		statelessService.addProduct(product.getProductName(), product.getPrice());
		productListStateless = statelessService.getProducts();

	}

	public Product getProduct() {
		return product;
	}


	public void setProduct(Product newProduct) {
		this.product = newProduct;
	}


	
	public List<Product> getProductListStateful() {
		return productListStateful;
	}

	public void setProductListStateful(List<Product> productList) {
		this.productListStateful = productList;
	}
	
	public List<Product> getProductListStateless() {
		return productListStateless;
	}

	public void setProductListStateless(List<Product> productList) {
		this.productListStateless = productList;
	}



}
