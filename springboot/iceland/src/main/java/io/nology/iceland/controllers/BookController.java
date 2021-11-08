package io.nology.iceland.controllers;

import io.nology.iceland.entities.Book;
import io.nology.iceland.payloads.books.BookCreate;
import io.nology.iceland.payloads.books.BookUpdate;
import io.nology.iceland.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
//This sets the initial part of the URL that this class works with
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    private BookService bookService;

    //Getting books
    @GetMapping(value = "/test")
    public String test() {
        return "Hello world!";
    }

    @GetMapping(value = "/test/{name}")
    public String testName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping(value = "/test/{name}/{age}")
    public String testNameAge(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello %s, you are %d years old", name, age);
    }

    //Creating books
    //ALSO NEED TO CREATE DTO FOR THIS
    @PostMapping
    public void saveBook(@Valid @RequestBody BookCreate book){
        this.bookService.create(book);
    }

//    @PatchMapping(value="/{id}")
//    public Book update(@PathVariable Long id, @Valid @RequestBody BookUpdate bookUpdate) {
//        return this.bookService.create(bookUpdate);
//    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {
        this.bookService.delete(id);
    }

}
