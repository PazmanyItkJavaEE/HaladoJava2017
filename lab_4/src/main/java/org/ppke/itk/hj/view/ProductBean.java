package org.ppke.itk.hj.view;

import org.ppke.itk.hj.interfaces.ProductServiceLocal;
import org.ppke.itk.hj.model.Product;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * Support creating and retrieving Product entities
	 */
    @EJB
    private ProductServiceLocal productService;

    
    private List<Product> products = new ArrayList<>()  ;
    
    
    private Integer itemId;
    
    private Double price;
    
    private String productName;
    
    
   @PostConstruct
   public void postConstruct(){
	   products = productService.getProducts();	   
   }
    
    public String create() {
    	itemId = null;
    	productName = new String();
    	price = null;
		return "create?faces-redirect=true";
	}
    
    public String edit(Integer id,String name, Double oldPrice) {
    	itemId = id;
    	productName = name;
    	price = oldPrice;
		return "edit?faces-redirect=true";
	}

	
//	public void getAll() {
//		productListStateful = statefulService.getProducts();
//		productListStateless = statelessService.getProducts();
//
//	}
	

	
	public String addProduct(){
		productService.addProduct(productName, price);
		products = productService.getProducts();
		return "view?faces-redirect=true";
	}
	
	public String updateProduct(){
		productService.updateProduct(itemId,productName, price);
		products = productService.getProducts();
		return "view?faces-redirect=true";

	}
	
	public String removeProduct(Product product){
		productService.removeProduct(product);
		products = productService.getProducts();
		return "view?faces-redirect=true";

	}


	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> productList) {
		this.products = productList;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}



}
