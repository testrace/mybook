package com.juvorak.mybook.api;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

public class NaverBookRepository implements BookRepository {

    public static final String ID = "MMbAku6ExV_Ayj66hBau";
    public static final String SECRET = "DYgeAlQ01i";

    @Override
    public Book findByIsbn(Isbn isbn) {
        final RestTemplate restTemplate = new RestTemplate();
        final WebClient sdf = WebClient.create("sdf");

        return null;
    }
}
