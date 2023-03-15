package vn.capa.entities;

import javax.persistence.*;
import java.util.List;

@Table(name="product")
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy="product")
	private List<ProductOrderData> productOrderData;
	@Column(name = "is_out_of_stock")
	private boolean isOutOfStock;
	private double weight;
	private double height;
	private int size;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOutOfStock() {
		return isOutOfStock;
	}

	public void setOutOfStock(boolean outOfStock) {
		isOutOfStock = outOfStock;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<ProductOrderData> getProductOrderData() {
		return productOrderData;
	}

	public void setProductOrderData(List<ProductOrderData> productOrderData) {
		this.productOrderData = productOrderData;
	}
}
