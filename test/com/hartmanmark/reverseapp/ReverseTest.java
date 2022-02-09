package com.hartmanmark.reverseapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseTest {

    private Reverse reverse;

    @BeforeEach
    void init() {
        reverse = new Reverse();
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsNull() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            reverse.reverseString(null);
        });
        assertEquals("null", exception.getMessage());
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsEmptyString() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            reverse.reverseString("");
        });
        assertEquals("Empty String", exception.getMessage());
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsSingleSpaces() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            reverse.reverseString(" ");
        });
        assertEquals("White Space Only String", exception.getMessage());
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsSeveralSpaces() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            reverse.reverseString("     ");
        });
        assertEquals("White Space Only String", exception.getMessage());
    }

    @Test
    void reverseString_shouldReturnSingleCharacter_whenInputStringContainsSingleCharacter() {
        assertEquals("a", reverse.reverseString("a"));
    }

    @Test
    void reverseString_shouldReturnReversedMultipleSameLetter_whenInputStringContainsMultipleSameLetter() {
        assertEquals("PPPPP", reverse.reverseString("PPPPP"));
    }

    @Test
    void reverseString_shouldReturnReversedMixedSameCharacterInLowerAndUpperCases_whenInputStringContainsMixedSameCharacterInLowerAndUpperCases() {
        assertEquals("PPPPppppPPPpppPPppPp", reverse.reverseString("pPppPPpppPPPppppPPPP"));
    }

    @Test
    void reverseString_shouldReturnReversedWordWithDifferentLettesr_whenInputStringContainsWordWithDifferentLettesr() {
        assertEquals("scitengamordyh", reverse.reverseString("hydromagnetics"));
    }

    @Test
    void reverseString_shouldReturnOnlySymbols_whenInputStringContainsOnlySymbols() {
        assertEquals("!@#$%^&*()_+~|/?", reverse.reverseString("!@#$%^&*()_+~|/?"));
    }

    @Test
    void reverseString_shouldReturnReversedSeveralWords_whenInputStringContainsSeveralWords() {
        assertEquals("liN enis ongam ativ erobal tided subilatrom",
                reverse.reverseString("Nil sine magno vita labore dedit mortalibus"));
    }
}
