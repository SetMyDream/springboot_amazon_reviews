package com.reviews.demo.service.impl;

import com.reviews.demo.model.Comment;
import com.reviews.demo.repository.CommentRepository;
import com.reviews.demo.service.CommentService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void saveAll(List<Comment> comments) {
        commentRepository.saveAll(comments);
    }
}
