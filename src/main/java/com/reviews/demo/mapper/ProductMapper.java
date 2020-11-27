package com.reviews.demo.mapper;

import com.reviews.demo.dto.CommentDto;
import com.reviews.demo.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product map(CommentDto commentDto) {
        Product product = new Product();
        product.setExternalId(commentDto.getProductId());
        return product;
    }
}
