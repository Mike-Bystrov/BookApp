package com.springapp.repository;

import com.springapp.model.Book;
import com.springapp.model.Author;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface BookRepository {

    void createBook(Book book);

    Book getBookById(Long id);

    Book getBookByIsbn(Long isbn);

    List<Book> getAllBooks();

    void updateBook(Book book);

    void deleteBook(Long id);
}
