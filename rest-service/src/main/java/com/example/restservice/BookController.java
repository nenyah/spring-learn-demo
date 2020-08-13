package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BookController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/book")
    public Book book(@RequestParam(value = "name", defaultValue = "java") String name, @RequestParam(value = "author",
            defaultValue = "steven") String author) {
        return new Book(counter.incrementAndGet(), name, author);
    }
}
