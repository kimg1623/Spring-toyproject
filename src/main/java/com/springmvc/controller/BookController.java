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
public class BookController {

    @Autowired // 의존성 주입
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String requestBookList(Model model){ // 웹 요청 처리할 메서드
        List<Book> list = bookService.getAlliBookList();
        model.addAttribute("bookList", list); // model 객체에 view에 전달할 정보 담는다.
        return "books"; // view
    }


}
