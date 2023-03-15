package vn.capa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.capa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
