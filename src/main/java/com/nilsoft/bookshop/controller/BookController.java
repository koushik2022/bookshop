package com.nilsoft.bookshop.controller;

import com.nilsoft.bookshop.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/books")
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

    @GetMapping("/")
    public List<Book> getBooks(){
        Book book = new Book();
        book.setId("xd01245");
        book.setAuthor("Joshua Bloch");
        book.setName("Effective Java");
        book.setVersion("3");
        book.setPrice("INR 990");
        book.setYearPublished("2017");

        Book book1 = new Book();
        book1.setId("PF01245");
        book1.setAuthor("Narashima");
        book1.setName("Java Data structure");
        book1.setVersion("2");
        book1.setPrice("INR 660");
        book1.setYearPublished("2015");

        return Arrays.asList(book,book1);
    }
}
