package org.ppke.itk.hj.model;


import java.io.Serializable;
import java.util.Set;

import org.ppke.itk.hj.model.Customer;
import org.ppke.itk.hj.model.Product;

import java.util.HashSet;


public class Order implements Serializable {


	private Long id;

	private int version;

	private Customer customer;

	private Set<Product> products = new HashSet<Product>();

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}
	

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(final Set<Product> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (id != null)
			result += "id: " + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


}