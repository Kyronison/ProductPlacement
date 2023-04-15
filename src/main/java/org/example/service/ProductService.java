package org.example.service;

import org.example.domain.Product;

import java.util.List;

public interface ProductService {
    Product insert(
            int user_id,
            String nameProduct,
            String locationProduct,
            String costProduct
    );

    Product update(
            int id,
            String nameProduct,
            String locationProduct,
            String costProduct
    );
    List<Product> getAll();

    Product getById(int id);

    List<Product> getByName(String nameProduct);

    void deleteById(int id);
}
