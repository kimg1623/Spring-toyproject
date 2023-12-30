package com.springmvc.service;

import com.springmvc.domain.Book;
import com.springmvc.repository.impl.BookRepository;
import com.springmvc.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service // 프레젠테이션 계층(controller)과 퍼시스턴트 계층(repository)을 연결
public class BookServiceImpl implements BookService {

    @Autowired // Autowired: 의존관계 자동 설정, Autowired 애너테이션을 사용하면 인스턴스에 대한 setter()메서드를 사용하지 않아도 됨.
    private BookRepository bookRepository;

    @Override
    public List<Book> getAlliBookList() {
        return bookRepository.getAllBookList();
    }

    @Override
    public List<Book> getBookListByCategory(String bookCategory) {
        List<Book> booksByCategory = bookRepository.getBookListByCategory(bookCategory);
        return booksByCategory;
    }

    @Override
    public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
        return booksByFilter;
    }

    @Override
    public Book getBookById(String bookId) {
        Book bookById = bookRepository.getBookById(bookId);
        return bookById;
    }

    @Override
    public void setNewBook(Book book) {
        bookRepository.setNewBook(book);
    }
}
