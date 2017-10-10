package org.ppke.itk.hj.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ppke.itk.hj.interfaces.CustomerServiceLocal;
import org.ppke.itk.hj.interfaces.OrderServiceLocal;
import org.ppke.itk.hj.model.Order;
import org.ppke.itk.hj.model.Product;

@Stateless
public class OrderService implements OrderServiceLocal {
	

	
	@EJB
	private CustomerServiceLocal customerService;

	@Override
	public void addOrder(String userName, String firstName, String lastName, List<Product> products) {

	}

	@Override
	public List<Order> getOrders() {
		TypedQuery<Order> query = entityManager.createQuery("SELECT o FROM Order o join fetch o.customer", Order.class);
		return query.getResultList();
	}

}
