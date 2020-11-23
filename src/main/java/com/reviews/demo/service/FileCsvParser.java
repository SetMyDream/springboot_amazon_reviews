package com.reviews.demo.service;

import java.util.List;

public interface FileCsvParser<T> {
    List<T> parse(String path);
}
