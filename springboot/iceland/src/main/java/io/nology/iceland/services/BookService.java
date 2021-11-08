package io.nology.iceland.services;
import io.nology.iceland.entities.Book;
import io.nology.iceland.payloads.books.BookCreate;
import io.nology.iceland.payloads.books.BookUpdate;
import io.nology.iceland.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional

public class BookService {
    @Autowired
    private BookRepo repo;

    public void create(BookCreate book){
        Book dbBook = new Book(book.getPages(), book.getIsHardCover(), book.getAuthor());
        repo.save(dbBook);
    }

//    public void update here

    public void delete(Long id) {this.repo.deleteById(id);}
}
