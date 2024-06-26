package com.example.DigitalLibrary.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private  Integer pages;

    @ManyToOne
    @JoinColumn
    private Author my_author;

    @ManyToOne
    @JoinColumn
    private Student my_student;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    @OneToMany(mappedBy = "my_book")
    List<Transaction> transactionList;
}
