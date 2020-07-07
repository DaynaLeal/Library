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

    @Column(nullable = false)
    private String author;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "published_date")
    private String publishedDate;

    @Column(name = "read_date")
    private String readDate;

    @Column(name = "times_read")
    private int timesRead;

    private String review;
    private int rating;

    @Column(name = "free_read")
    private String freeRead;

    @Column(name = "medium_type")
    private String mediumType;

    @Column(name = "literary_type")
    private String literaryType;

    private String genre;

    //CONSTRUCTORS

    public Book(){}

    public Book(String volumeId, String title, String author, String description, String imageUrl, String publishedDate, String readDate, int timesRead, String review, int rating, String freeRead, String mediumType, String literaryType, String genre) {
        this.volumeId = volumeId;
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageUrl = imageUrl;
        this.publishedDate = publishedDate;
        this.readDate = readDate;
        this.timesRead = timesRead;
        this.review = review;
        this.rating = rating;
        this.freeRead = freeRead;
        this.mediumType = mediumType;
        this.literaryType = literaryType;
        this.genre = genre;
    }

    //GETTERS AND SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getReadDate() {
        return readDate;
    }

    public void setReadDate(String readDate) {
        this.readDate = readDate;
    }

    public int getTimesRead() {
        return timesRead;
    }

    public void setTimesRead(int timesRead) {
        this.timesRead = timesRead;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFreeRead() {
        return freeRead;
    }

    public void setFreeRead(String freeRead) {
        this.freeRead = freeRead;
    }

    public String getMediumType() {
        return mediumType;
    }

    public void setMediumType(String mediumType) {
        this.mediumType = mediumType;
    }

    public String getLiteraryType() {
        return literaryType;
    }

    public void setLiteraryType(String literaryType) {
        this.literaryType = literaryType;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
