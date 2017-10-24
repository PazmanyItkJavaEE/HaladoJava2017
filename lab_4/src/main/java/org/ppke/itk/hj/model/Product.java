package org.ppke.itk.hj.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product")
@NamedQueries(value =
{ @NamedQuery(name = "getAllProducts", query = "SELECT p FROM Product p") }
)	
public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6750697117105719499L;
	
	public static final String getAllProducts = "getAllProducts";
	
	@Id
	@SequenceGenerator(name="product_seq",sequenceName="product_seq", allocationSize=100)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_seq")
	@Column(name = "uid", unique = true, nullable = false)
	private Integer id;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="price")
	private Double price;

	public Product() {
	}
	
	public Product(String productname, Double price) {
		this.productName = productname;
		this.price = price;
	}
	
	public Product(Integer id,String productname, Double price) {
		this(productname, price);
		this.id = id;
		
		
	}
	

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productname) {
		this.productName = productname;
	}


	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


}