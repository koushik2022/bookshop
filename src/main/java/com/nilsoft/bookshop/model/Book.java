package com.nilsoft.bookshop.model;

import lombok.Data;

@Data
public class Book {
    String id;
    String name;
    String price;
    String author;
    String version;
    String yearPublished;
}
