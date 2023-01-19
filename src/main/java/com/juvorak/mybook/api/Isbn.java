package com.juvorak.mybook.api;

import java.util.List;

public record Isbn(String value) {

    private static final List<Integer> VALID_ISBN_LENGTHS = List.of(10, 13);

    public Isbn {
        validateLength(value);
    }

    private void validateLength(String value) {
        if (!VALID_ISBN_LENGTHS.contains(value.length())) {
            throw new IllegalArgumentException("ISBN은 10자리 또는 13자리여야 합니다.");
        }
    }
}
