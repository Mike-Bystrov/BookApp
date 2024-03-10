package com.springapp.repository;

import com.springapp.connection.DBConnection;
import com.springapp.model.Author;
import com.springapp.model.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createBook(Book book) {

    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public Book getBookByIsbn(Long isbn) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        String jpql = "SELECT b from Book b";
        TypedQuery<Book> query = entityManager.createQuery(jpql, Book.class);
        return query.getResultList();
    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void deleteBook(Long id) {

    }
}
