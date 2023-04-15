package org.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.Product;
import org.example.domain.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private int id;
    private String name;
    private int user_id;
    private String product_location;
    private int likes;
    private int views;
    private String cost;
    private UserDto userDto;
    public static ProductDto toDto(Product product){
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getUser().getId(),
                product.getProduct_location(),
                product.getLikes(),
                product.getViews(),
                product.getCost(),
                UserDto.toDto(product.getUser())
        );
    }
}
