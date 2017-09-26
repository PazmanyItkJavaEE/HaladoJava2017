package org.ppke.itk.hj.model;


import java.io.Serializable;


public class Product implements Serializable {


	private static final long serialVersionUID = -4776677763536285190L;

	private Long id;

	private String productName;

	private Double price;

	private ProductType productType;
	
	public Product(){
		
	}
	
	public Product(String productName, Double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
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

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
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
		
		if (productName != null && !productName.trim().isEmpty())
			result += ", productName: " + productName;
		if (price != null)
			result += ", price: " + price;
		if (productType != null)
			result += ", productType: " + productType;
		return result;
	}
}