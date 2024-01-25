package com.SynergisticIT.Libary.repository;

import com.SynergisticIT.Libary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
