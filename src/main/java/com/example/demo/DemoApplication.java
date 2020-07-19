package com.example.demo;

import com.example.demo.book.Book;
import com.example.demo.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    private BookRepository bookRepository;

    public DemoApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void init() {
        bookRepository.save(new Book("Lorem ipsum", "Blabla"));
        bookRepository.save(new Book("Krzyzacy", "lorem ipsum"));
    }
}
