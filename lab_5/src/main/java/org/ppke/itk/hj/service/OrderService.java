package org.ppke.itk.hj.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ppke.itk.hj.interfaces.CustomerServiceLocal;
import org.ppke.itk.hj.interfaces.OrderServiceLocal;
import org.ppke.itk.hj.model.Customer;
import org.ppke.itk.hj.model.Order;
import org.ppke.itk.hj.model.Product;

@Stateless
public class OrderService implements OrderServiceLocal {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@EJB
	private CustomerServiceLocal customerService;

	@Override
	public void addOrder(String userName, String firstName, String lastName, List<Product> products) {
		
		Customer customer = customerService.addCustomer(userName, lastName, firstName);
		Order order = new Order();
		order.setCustomer(customer);
		for(Product product : products){
			order.getProducts().add(entityManager.merge(product));
		}
		entityManager.merge(order);

	}

	@Override
	public List<Order> getOrders(String username) {
		TypedQuery<Order> query = entityManager.createNamedQuery(Order.getOrdersByUsername, Order.class)
				.setParameter("username", username);
		return query.getResultList();
	}
	
	@Override
	public List<Order> getOrders() {
		TypedQuery<Order> query = entityManager.createQuery("SELECT distinct o FROM Order o join fetch o.customer left join fetch o.products", Order.class);
		return query.getResultList();
	}

}
