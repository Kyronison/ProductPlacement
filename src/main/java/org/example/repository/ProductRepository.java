package org.example.repository;

import org.example.domain.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Override
    @EntityGraph( attributePaths = {"user"})
    List<Product> findAll();

    List <Product> findByName(String name);
}
