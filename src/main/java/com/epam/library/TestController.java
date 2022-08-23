package com.epam.library;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("")
    public String testMessage() {
        log.info("Get the test message.");
        return "This is the test message.";
    }
}
