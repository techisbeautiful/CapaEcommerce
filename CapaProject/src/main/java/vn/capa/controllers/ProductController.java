package vn.capa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.capa.entities.Product;
import vn.capa.services.ProductService;

@RequestMapping("/product")
@RestController
class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/create")
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}

}
