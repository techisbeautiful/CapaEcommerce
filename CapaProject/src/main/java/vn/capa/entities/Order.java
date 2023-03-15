package vn.capa.entities;

import vn.capa.enums.Status;

import javax.persistence.*;
import java.util.List;

@Table(name="\"order\"")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy="order")
    private List<ProductOrderData> productOrderData;
    @Column(name="is_delete")
    private boolean isDelete;
    @Column(name="total_price")
    private double totalPrice;
    @Column(name="tax")
    private double tax;
    @Enumerated(value=EnumType.STRING)
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductOrderData> getProductOrderData() {
        return productOrderData;
    }

    public void setProductOrderData(List<ProductOrderData> productOrderData) {
        this.productOrderData = productOrderData;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
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
