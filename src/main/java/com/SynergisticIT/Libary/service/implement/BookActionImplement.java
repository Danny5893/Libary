package com.SynergisticIT.Libary.service.implement;

import com.SynergisticIT.Libary.service.BookService;
import com.SynergisticIT.Libary.model.Book;
import com.SynergisticIT.Libary.repository.BookRepository;

import java.util.List;

public class BookActionImplement implements BookService {

    private BookRepository bookRepository;

    public BookActionImplement(BookRepository bookRepository){
        super();
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll() ;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookByID(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookByID(int id) {
        bookRepository.deleteById(id);
    }
}
