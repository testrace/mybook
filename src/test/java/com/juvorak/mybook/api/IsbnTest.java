package com.juvorak.mybook.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class IsbnTest {

    @DisplayName("Isbn 객체 생성")
    @ParameterizedTest(name = "Isbn 객체 생성 [{arguments}]")
    @ValueSource(strings = {"1234567890", "1234567890123"})
    void create(final String isbn) {
        final Isbn actual = new Isbn(isbn);

        assertThat(actual).isEqualTo(new Isbn(isbn));

    }
}
