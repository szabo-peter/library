package com.epam.library.service;

import com.epam.library.model.Author;
import com.epam.library.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author createAuthor(String name) {
        Author newAuthor = authorRepository.save(Author.builder().name(name).build());
        log.info("Created an author with these params: {}", newAuthor);
        return newAuthor;
    }

    public List<Author> getAllAuthor() {
        List<Author> authors = authorRepository.findAll();
        log.info("Found {} author(s).", authors.size());
        return authors;
    }
}
