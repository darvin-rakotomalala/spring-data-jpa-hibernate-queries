package com.poc.service.repository.book;

import com.poc.donnee.domain.Book;
import com.poc.donnee.dto.BookWithAuthorNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT new com.poc.donnee.dto.BookWithAuthorNames(b.id, b.title, b.price, concat(a.firstName, ' ', a.lastName)) FROM Book b JOIN b.author a WHERE b.title LIKE %:title%")
    List<BookWithAuthorNames> booksList(String title);
}
