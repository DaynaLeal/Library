package com.library.speedreader.models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "volume_id", nullable = false, unique = true)
    private String volumeId;

    @Column(nullable = false)
    private String title;

    private String author;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    private String publishedDate;
    private String readDate;
    private int timesRead;
    private String review;
    private int rating;
    private String freeRead;
    private String mediumType;
    private String literaryType;
    private String genre;
}
