package com.springmvc.repository.impl;

import com.springmvc.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookRepository {
    List<Book> getAllBookList();

    List<Book> getBookListByCategory(String bookCategory);

    Set<Book> getBookListByFilter(Map<String, List<String>> filter);

    Book getBookById(String bookId);

}
