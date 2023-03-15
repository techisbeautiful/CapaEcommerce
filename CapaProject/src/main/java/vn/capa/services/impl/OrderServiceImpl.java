package vn.capa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.capa.entities.Order;
import vn.capa.repositories.OrderRepository;
import vn.capa.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order create(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Order update(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
