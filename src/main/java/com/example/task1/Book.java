package com.example.task1;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int pages;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}