package com.nilsoft.bookshop.controller;

import com.nilsoft.bookshop.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/{bookId}")
    public Book getBook(@PathParam("bookId") String bookId){
        Book book = new Book();
        book.setId("xd01245");
        book.setAuthor("Joshua Bloch");
        book.setName("Effective Java");
        book.setVersion("3");
        book.setPrice("INR 990");
        book.setYearPublished("2017");
        return book;
    }
}
