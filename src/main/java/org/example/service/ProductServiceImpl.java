package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.Product;
import org.example.repository.ProductRepository;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final UserRepository userRepository;
    private final ProductRepository productRepository;


    @Override
    public Product insert(int user_id, String nameProduct, String locationProduct, String costProduct, String descriptionProduct) {
        Product product = Product.builder()
                .user(userRepository.getById(user_id))
                .name(nameProduct)
                .product_location(locationProduct)
                .cost(costProduct)
                .description(descriptionProduct).
                build();
        return productRepository.save(product);
    }

    @Override
    public Product update(int id, String nameProduct, String locationProduct, String costProduct) {
        Product product = Product.builder()
                .id(id)
                .name(nameProduct)
                .product_location(locationProduct)
                .cost(costProduct).
                build();
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> getByName(String nameProduct) {
        return productRepository.findByName(nameProduct);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
