package com.poc.donnee.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BookWithAuthorNames {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long bookId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double price;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String authorNames;

    public BookWithAuthorNames(Long bookId, String title, Double price, String authorNames) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.authorNames = authorNames;
    }

    public Long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getAuthorNames() {
        return authorNames;
    }
}
