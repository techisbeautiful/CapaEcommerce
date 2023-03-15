package vn.capa.services;

import vn.capa.entities.ProductOrderData;

import java.util.List;

public interface ProductOrderDataService {
    ProductOrderData createProductOrder(ProductOrderData productOrderData, int orderId, int productId);
    List<ProductOrderData> findAllByOrderId(int orderId);
    ProductOrderData updateProductOder(ProductOrderData productOrderData);
    ProductOrderData deleteProductOrder(ProductOrderData productOrderData);
}
