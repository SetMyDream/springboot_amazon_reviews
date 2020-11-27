package com.reviews.demo.service;

import com.reviews.demo.model.Comment;
import java.util.List;

public interface CommentService {
    void saveAll(List<Comment> entities);
}
