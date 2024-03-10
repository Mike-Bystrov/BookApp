package com.springapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long isbn;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {

    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("isbn")
    public Long getIsbn() {
        return isbn;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(Long id, Long isbn, String name, String desc, Author a) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        description = desc;
        author = a;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author=" + author +
                '}';
    }
}
