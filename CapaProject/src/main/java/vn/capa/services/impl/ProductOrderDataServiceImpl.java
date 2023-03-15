package vn.capa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.capa.entities.Order;
import vn.capa.entities.Product;
import vn.capa.entities.ProductOrderData;
import vn.capa.repositories.OrderRepository;
import vn.capa.repositories.ProductOrderDataRepository;
import vn.capa.repositories.ProductRepository;
import vn.capa.services.ProductOrderDataService;

import java.util.List;

@Service
public class ProductOrderDataServiceImpl implements ProductOrderDataService {

    @Autowired
    private ProductOrderDataRepository productOrderDataRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductOrderData createProductOrder(ProductOrderData productOrderData, int orderId, int productId) {
        Order order = orderRepository.findById(orderId).get();
        Product product = productRepository.findById(productId).get();
        productOrderData.setOrder(order);
        productOrderData.setProduct(product);
        return productOrderDataRepository.save(productOrderData);
    }

    //Nit làm
    // Dùng lấy hết product đã order dùng hàm definde ở repository
    @Override
    public List<ProductOrderData> findAllByOrderId(int orderId) {
        return null;
    }

    //Nit làm
    @Override
    public ProductOrderData updateProductOder(ProductOrderData productOrderData) {
        return null;
    }

    //Nit làm
    @Override
    public ProductOrderData deleteProductOrder(ProductOrderData productOrderData) {
        return null;
    }
}
