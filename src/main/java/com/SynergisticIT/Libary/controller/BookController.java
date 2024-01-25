package com.SynergisticIT.Libary.controller;

import com.SynergisticIT.Libary.model.Book;
import org.springframework.ui.Model;
import com.SynergisticIT.Libary.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    private BookService bookService;

    public  BookController(BookService bookActions){
        super();
        this.bookService = bookActions;
    }

    @GetMapping("/books")
    public String listBook(Model model){
        model.addAttribute("book", bookService.getAllBooks());
        return "book";
    }

    @GetMapping("/books/new")
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable Integer id, Model model){
        model.addAttribute("book", bookService.getBookByID(id));
        return "edit_book";
    }

    @PostMapping("/user/{id}")
    public  String updateBook(@PathVariable Integer id, @ModelAttribute("book")Book book, Model model){
        Book existingBook = bookService.getBookByID(id);
        existingBook.setBook_id(id);
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setISBN(book.getISBN());
        existingBook.setNumberCopies(book.getNumberCopies());
        existingBook.setNumAvailableCopies(book.getNumAvailableCopies());
        bookService.updateBook(existingBook);
        return "redirect:/books";
    }

    @GetMapping
    public String deleteBook(@PathVariable Integer id){
        bookService.deleteBookByID(id);
        return "redirect:/books";
    }
}
