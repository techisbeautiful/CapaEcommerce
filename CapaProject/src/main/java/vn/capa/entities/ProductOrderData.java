package vn.capa.entities;

import vn.capa.enums.Color;

import javax.persistence.*;

@Table(name="product_order_data")
@Entity
public class ProductOrderData {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;
    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;
    private int quantity;
    @Enumerated(value = EnumType.STRING)
    private Color color;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
