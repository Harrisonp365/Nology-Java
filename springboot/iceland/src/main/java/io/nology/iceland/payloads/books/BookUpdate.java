package io.nology.iceland.payloads.books;

import io.nology.iceland.entities.Book;
import lombok.Getter;
import lombok.Setter;

public class BookUpdate {
    @Getter
    @Setter
    private String author;

    public BookUpdate(){}

    public BookUpdate(String author) { this.setAuthor(author); }
}
