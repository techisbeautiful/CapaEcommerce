package vn.capa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	 @PutMapping("/update")
	    public Product updateProduct(@RequestBody Product product) {
	    	System.out.print(product.getName() + "XXXXX");
	        return productService.update(product);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public void deleteProduct(@PathVariable("id")int id) {
	        productService.delete(id);
	    }
}
