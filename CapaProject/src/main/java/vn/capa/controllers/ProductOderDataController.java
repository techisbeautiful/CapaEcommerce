package vn.capa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.capa.entities.ProductOrderData;
import vn.capa.services.ProductOrderDataService;

@RequestMapping("/product_order")
@RestController
public class ProductOderDataController {
    @Autowired
    private ProductOrderDataService service;

    @PostMapping("/create/{order_id}/{product_id}")
    public ProductOrderData create(@RequestBody ProductOrderData productOrderData,
                                   @PathVariable("order_id") int orderId,
                                   @PathVariable("product_id") int productId) {
        return service.createProductOrder(productOrderData, orderId, productId);
    }
}
