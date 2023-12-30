package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/books") // 클래스 수준의 @RequestMapping
public class BookController {

    @Autowired // 의존성 주입
    private BookService bookService;

    @RequestMapping // 메서드 수준의 @RequestMapping -> method 속성 기본값=GET
    public String requestBookList(Model model){ // 웹 요청 처리할 메서드
        List<Book> list = bookService.getAlliBookList();
        model.addAttribute("bookList", list); // model 객체에 view에 전달할 정보 담는다.
        return "books"; // view
    }

    @RequestMapping("/all")
    public String requestAllBooks(Model model){ // 웹 요청 처리할 메서드
        List<Book> list = bookService.getAlliBookList();
        model.addAttribute("bookList", list); // model 객체에 view에 전달할 정보 담는다.
        return "books"; // view
    }





}
