package com.epam.library.controller;

import com.epam.library.model.Author;
import com.epam.library.service.AuthorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping("")
    public Author createAuthor(@RequestParam(name = "name") String name) {
        log.info("Create an author with this name: {}", name);
        return authorService.createAuthor(name);
    }

    @GetMapping("")
    public List<Author> getAllAuthor() {
        log.info("Get all authors.");
        return authorService.getAllAuthor();
    }
}
