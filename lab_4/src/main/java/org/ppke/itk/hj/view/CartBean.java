package org.ppke.itk.hj.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.ppke.itk.hj.interfaces.OrderServiceLocal;
import org.ppke.itk.hj.model.Product;

@ManagedBean
@SessionScoped
public class CartBean implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 243070291767836331L;
	
	@EJB
	private OrderServiceLocal orderService;
	
	private List<Product> cart = new ArrayList<>();
	
	private String username = new String();
	private String lastname = new String();
	private String firstname = new String();
	
	public void addProductToCart(Product product){
		cart.add(product);
	}
	
	public String addOrder(){
		orderService.addOrder(username, firstname, lastname, cart);
		return "index?faces-redirect=true";
		
	}
	

	public List<Product> getCart() {
		return cart;
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
