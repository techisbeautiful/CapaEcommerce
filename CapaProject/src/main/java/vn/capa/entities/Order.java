package vn.capa.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import vn.capa.enums.Color;
import vn.capa.enums.Status;

@Table(name="order")
@Entity
public class Order {
@Id
@GeneratedValue (strategy= GenerationType.IDENTITY)
private int id;

private List<Product> products;

@Column(name = "is_delete")
private boolean isDelete;
@Column(name = "total_price")
private double totalPrice;
private double tax;

@Enumerated(value=EnumType.STRING)
private Status status;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<Product> getProducts() {
	return products;
}

public void setProducts(List<Product> products) {
	this.products = products;
}

public boolean isDelete() {
	return isDelete;
}

public void setDelete(boolean isDelete) {
	this.isDelete = isDelete;
}

public double getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

public double getTax() {
	return tax;
}

public void setTax(double tax) {
	this.tax = tax;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

}
