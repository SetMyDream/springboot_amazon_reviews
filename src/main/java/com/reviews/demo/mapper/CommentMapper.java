package com.reviews.demo.mapper;

import com.reviews.demo.dto.CommentDto;
import com.reviews.demo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    private final ProductMapper productMapper;
    private final UserMapper userMapper;

    public CommentMapper(ProductMapper productMapper, UserMapper userMapper) {
        this.productMapper = productMapper;
        this.userMapper = userMapper;
    }

    public Comment map(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setHelpfulnessNumerator(commentDto.getHelpfulnessNumerator());
        comment.setHelpfulnessDenominator(commentDto.getHelpfulnessDenominator());
        comment.setScore(commentDto.getScore());
        comment.setTime(commentDto.getTime());
        comment.setSummary(commentDto.getSummary());
        comment.setText(commentDto.getText());
        comment.setProduct(productMapper.map(commentDto));
        comment.setUser(userMapper.map(commentDto));
        return comment;
    }
}
