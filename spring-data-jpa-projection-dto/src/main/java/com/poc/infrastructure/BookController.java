package com.poc.infrastructure;

import com.poc.donnee.dto.BookWithAuthorNames;
import com.poc.service.metier.book.BookSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/book")
public class BookController {
    @Autowired
    private BookSM bookSM;

    @GetMapping
    public List<BookWithAuthorNames> getBooksByTitle(@RequestParam(defaultValue = "") String title) {
        return bookSM.getBooksByTitle(title);
    }
}
