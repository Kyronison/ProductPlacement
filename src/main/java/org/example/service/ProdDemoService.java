package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.Product;
import org.example.domain.User;
import org.example.repository.ProductRepository;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdDemoService {

    private final UserRepository userRepository;
    private final ProductService productService;

    private final ProductRepository productRepository;

    public void userDemo() {
//        List<User> userList = userRepository.findAll();
//
//        System.out.println("=============");
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        System.out.println("=============");

        User user = User.builder()
                .name("Иван")
                .build();

        userRepository.save(user);
//        userList = userRepository.findAll();
//
//        System.out.println("=============");
//        for (User user1 : userList) {
//            System.out.println(user1);
//        }
//        System.out.println("=============");
//
//        System.out.println(userRepository.findByName("Иван"));
    }

    @Transactional
    public void prodDemo() {

        /*List <Product> productList = productRepository.findAll();
        for (Product product :productList){
            System.out.println(product.getName()+":");
            System.out.println(product.getUser());
        }*/
//        List<Product> productList = productService.getAll();
//        for (Product product : productList) {
//            System.out.println(product.getName() + ":");
//            System.out.println(product.getUser());
//        }
        productService.insert(
                1,
                "Кошка",
                "Moscow",
                "50000"
                );
    }
}
