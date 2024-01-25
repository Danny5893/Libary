package com.SynergisticIT.Libary.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "book_author", nullable = false)
    private String author;

    @Column(name = "book_ISBN", nullable = false)
    private int ISBN;

    @Column(name = "book_copies", nullable = false)
    private int numberCopies;

    @Column(name = "book_copies_available", nullable = false)
    private int numAvailableCopies;


    Book(int book_id, String title, String author, int ISBN, int numberCopies, int numAvailableCopies){
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberCopies = numberCopies;
        this.numAvailableCopies=numAvailableCopies;
    }

    Book(){

    }
    public String getAuthor() {
        return author;
    }
    public int getBook_id() {
        return book_id;
    }
    public String getTitle(){
        return title;
    }
    public int getISBN(){
        return ISBN;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
    }

    public int getNumAvailableCopies() {
        return numAvailableCopies;
    }

    public void setNumAvailableCopies(int numAvailableCopies) {
        this.numAvailableCopies = numAvailableCopies;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN ;
    }

    public boolean isAvailable() {
        return numAvailableCopies > 0;
    }

}
