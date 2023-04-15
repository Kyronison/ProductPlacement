package org.example.rest.controller;

import lombok.RequiredArgsConstructor;
import org.example.domain.Product;
import org.example.rest.dto.ProductDto;
import org.example.service.ProductService;
import org.example.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/product")
    public List<ProductDto> getAllProduct(){
        List<ProductDto> productDtoList = productService.getAll().stream().map(ProductDto::toDto).collect(Collectors.toList());
        return productDtoList;
    }
    @PostMapping("/product")
    public ProductDto insertProduct(
        @RequestParam int user_id,
        @RequestParam String nameProduct,
        @RequestParam String locationProduct,
        @RequestParam String costProduct
        ){
        Product product = productService.insert(user_id,nameProduct,locationProduct,costProduct);
        return ProductDto.toDto(product);
    }
    @PutMapping("/product")
    public ProductDto updateProduct(@PathVariable int id,
                                    @RequestParam String nameProduct,
                                    @RequestParam String locationProduct,
                                    @RequestParam String costProduct){
        Product product = productService.update(id,nameProduct,locationProduct,costProduct);
        return ProductDto.toDto(product);
    }
    @GetMapping("/product/{id}")
    public ProductDto getProductById(@PathVariable int id){
        return ProductDto.toDto(productService.getById(id));
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteById(id);
    }

}
