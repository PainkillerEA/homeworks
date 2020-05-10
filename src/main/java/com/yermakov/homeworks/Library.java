package com.yermakov.homeworks;

import java.time.LocalDate;
import java.util.*;

public class Library {
    private final Map<LocalDate, List<String>> dateOnBooks = new TreeMap<>();

    public String takeBook(LocalDate date, String bookName) {
        List<String> booksByDate = dateOnBooks.get(date);
        if (booksByDate == null) {
            booksByDate = new ArrayList<>();
            booksByDate.add(bookName);
            dateOnBooks.put(date, booksByDate);
        } else {
            booksByDate.add(bookName);
        }
        return bookName;
    }

    public List<String> findBooks(LocalDate date) {
        List<String> booksByDate = dateOnBooks.get(date);
        if (booksByDate == null) {
            System.out.println("No books for chosen date");
        }
        return booksByDate;
    }

    public Set<LocalDate> takenBooksDatesRange() {
        return dateOnBooks.keySet();
    }

    public List<String> allTakenBooks() {
        List<String> allTakenBooks = new ArrayList<>();
        for (List<String> books:dateOnBooks.values()){
            allTakenBooks.addAll(books);
        }
        return allTakenBooks;
    }
}
