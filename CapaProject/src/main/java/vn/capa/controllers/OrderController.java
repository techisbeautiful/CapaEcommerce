package vn.capa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.capa.entities.Order;
import vn.capa.services.OrderService;


@RequestMapping("/order")
@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create")
	public Order create(@RequestBody Order order) {
		return orderService.create(order);
	}
	 @PutMapping("/update")
	    public Order updateOrder(@RequestBody Order order) {
	    	System.out.print(order.getId() + "XXXXX");
	        return orderService.update(order);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public void deleteOrder(@PathVariable("id")int id) {
	        orderService.delete(id);
	    }
	    
}
