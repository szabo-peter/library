package com.epam.library.controller;

import com.epam.library.model.Book;
import com.epam.library.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/book")
public class BookController {

    private BookService bookService;

    @PostMapping("")
    public Book createBook(@RequestParam(name = "title") String title, @RequestParam(name = "authorId") String authorId) {
        log.info("Create a Book with this title: {} and authorId: {}", title, authorId);
        return bookService.createBook(title, authorId);
    }

    @GetMapping("")
    public List<Book> getAllBooks() {
        log.info("Get all Books");
        return bookService.getAllBooks();
    }
}
