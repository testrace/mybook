package com.juvorak.mybook.api;

public interface BookRepository {

    Book findByIsbn(Isbn isbn);


}
