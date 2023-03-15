package vn.capa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.capa.entities.ProductOrderData;

import java.util.List;

@Repository
public interface ProductOrderDataRepository extends JpaRepository<ProductOrderData, Integer> {
    List<ProductOrderData> findAllByOrderId(int orderId);
}
