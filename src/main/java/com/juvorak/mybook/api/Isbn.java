package com.juvorak.mybook.api;

import lombok.Data;

@Data
public class Isbn {

    private String value;

    public Isbn(String value) {
        this.value = value;
    }
}
