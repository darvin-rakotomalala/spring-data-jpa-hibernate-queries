package com.poc.service.metier.book;

import com.poc.donnee.dto.BookWithAuthorNames;

import java.util.List;

public interface BookSM {
    List<BookWithAuthorNames> getBooksByTitle(String title);
}
