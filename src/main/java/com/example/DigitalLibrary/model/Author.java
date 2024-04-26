package com.example.DigitalLibrary.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String country;

    private Date addedOn;

    @OneToMany(mappedBy = "my_author")
    private List<Book> bookList;
}
