package com.springmvc.service.impl;

import com.springmvc.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookService {
    List<Book> getAlliBookList();

    List<Book> getBookListByCategory(String bookCategory);

    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
}
