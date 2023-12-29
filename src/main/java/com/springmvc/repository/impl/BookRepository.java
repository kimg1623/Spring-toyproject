package com.springmvc.repository.impl;

import com.springmvc.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();

}
