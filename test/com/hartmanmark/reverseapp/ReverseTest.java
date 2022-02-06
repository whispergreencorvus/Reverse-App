package com.hartmanmark.reverseapp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseTest {

    @Test
    void expectedStringCanBeReversed() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA fedCBA fedcba", 
                reverse.reverseString("ABCDEF ABCdef abcdef"));
    }

    @Test
    void expectedNumbersStayInTheirPlaces() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA123 fedCBA123 fedcba123", 
                reverse.reverseString("ABCDEF123 ABCdef123 abcdef123"));
    }

    @Test
    void expectedSymbolsStayInTheirPlaces() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA!@#$%^&*() fedCBA!@#$%^&*() fedcba!@#$%^&*()",
                reverse.reverseString("ABCDEF!@#$%^&*() ABCdef!@#$%^&*() abcdef!@#$%^&*()"));
    }
}
