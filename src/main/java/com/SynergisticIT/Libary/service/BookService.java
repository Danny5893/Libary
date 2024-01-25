package com.SynergisticIT.Libary.service;

import com.SynergisticIT.Libary.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book saveBook(Book book);

    Book getBookByID(int id);

    Book updateBook(Book book);

    void deleteBookByID(int id);
}
