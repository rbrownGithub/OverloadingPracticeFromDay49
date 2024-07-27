package org.example;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private int pages;
    private int publicationYear;

    // Existing constructor
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // New constructors
    public Book() {
        this.title = "Unknown";
        this.pages = 0;
        this.publicationYear = 0;
    }

    public Book(String title) {
        this.title = title;
        this.pages = 0;
        this.publicationYear = 0;
    }

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getPublicationYear();
    }
}