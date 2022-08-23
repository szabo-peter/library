package com.epam.library.service;

import com.epam.library.model.Author;
import com.epam.library.model.Book;
import com.epam.library.repository.AuthorRepository;
import com.epam.library.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public Book createBook(String title, String authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow(() -> new RuntimeException("Give a valid authorID!"));
        Book newBook = bookRepository.save(Book.builder().title(title).author(author).build());
        log.info("Created a book with these params: {}", newBook);
        return newBook;

    }

    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        log.info("Found {} book(s).", books.size());
        return books;
    }
}
