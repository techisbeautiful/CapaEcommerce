package vn.capa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.capa.entities.Order;
import vn.capa.entities.Product;
import vn.capa.services.OrderService;
import vn.capa.services.ProductService;

@RequestMapping("/order")
@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create")
	public Order create(@RequestBody Order order) {
		return orderService.create(order);
	}
}
