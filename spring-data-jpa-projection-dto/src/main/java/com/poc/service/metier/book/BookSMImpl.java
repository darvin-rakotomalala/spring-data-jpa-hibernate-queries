package com.poc.service.metier.book;

import com.poc.donnee.dto.BookWithAuthorNames;
import com.poc.service.repository.book.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSMImpl implements BookSM {

    private BookRepository bookRepository;

    public BookSMImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookWithAuthorNames> getBooksByTitle(String title) {
        return bookRepository.booksList(title);
    }
}
