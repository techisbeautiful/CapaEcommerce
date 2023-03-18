package vn.capa.services;

import vn.capa.entities.Order;

public interface OrderService {
	public Order create(Order order);
	public Order update(Order order);
	public Order editOrder(Order order);
	public void delete(int id);

}
