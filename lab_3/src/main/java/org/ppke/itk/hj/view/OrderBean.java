package org.ppke.itk.hj.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.ppke.itk.hj.interfaces.OrderServiceLocal;
import org.ppke.itk.hj.model.Order;
import org.ppke.itk.hj.model.Product;

@Named
@SessionScoped
public class OrderBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8145938792106213984L;
	
	@EJB
	private OrderServiceLocal orderService;
	
	
	
	
	private List<Order> orders = new ArrayList<>();
	
	public void fillOrders() {
		
		orders = orderService.getOrders();
	}


	public String getProductsStringRepresentation(Order order){
		/* java 8-as megoldás -> compiler compliance-et 1.8-ra kell állitani*/
		/* return order.getProducts()
				.stream()
				.map(i -> i.getProductName())
				.collect(Collectors.joining(", "));*/


	
		StringBuilder builder = new StringBuilder();
		for(Product product: order.getProducts()){
			builder.append(product.getProductName()+", ");
		}
	
		 return builder.toString();
	
	}

	public List<Order> getOrders() {
		
		orders = orderService.getOrders();
		return orders;
	}



	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
