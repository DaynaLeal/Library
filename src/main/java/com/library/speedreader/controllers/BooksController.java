package com.library.speedreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {


    @GetMapping("/books")
    public String viewBooksPage(){
        return "books/books";
    }

    @GetMapping("/books/save")
    public String saveBookPage() {
        return "books/save-book";
    }
}
