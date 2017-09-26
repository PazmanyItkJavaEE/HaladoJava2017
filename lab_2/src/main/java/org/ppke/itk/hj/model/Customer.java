package org.ppke.itk.hj.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -385416831817406936L;

	private Long id;

	private String userName;

	private Set<Order> orders = new HashSet<Order>();

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public Set<Order> getCustomer() {
		return this.orders;
	}

	public void setCustomer(final Set<Order> orders) {
		this.orders = orders;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
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



	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (id != null)
			result += "id: " + id;
		if (userName != null && !userName.trim().isEmpty())
			result += ", userName: " + userName;
		return result;
	}

}