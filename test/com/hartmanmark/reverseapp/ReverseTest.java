package com.hartmanmark.reverseapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class ReverseTest {

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsNull() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Reverse reverse = new Reverse();
            reverse.reverseString(null);
        });
        assertEquals("Null, Empty, or White Space Only String", exception.getMessage());
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsEmptyString() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Reverse reverse = new Reverse();
            reverse.reverseString("");
        });
        assertEquals("Null, Empty, or White Space Only String", exception.getMessage());
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsSingleSpaces() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Reverse reverse = new Reverse();
            reverse.reverseString(" ");
        });
        assertEquals("Null, Empty, or White Space Only String", exception.getMessage());
    }

    @Test
    void reverseString_shouldGetIllegalArgumentException_whenInputStringContainsSeveralSpaces() {

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Reverse reverse = new Reverse();
            reverse.reverseString("     ");
        });
        assertEquals("Null, Empty, or White Space Only String", exception.getMessage());
    }

    @Test
    void reverseString_shouldReturnSingleCharacter_whenInputStringContainsSingleCharacter() {
        Reverse reverse = new Reverse();
        assertEquals("a", reverse.reverseString("a"));
    }

    @Test
    void reverseString_shouldReturnReversedMultipleSameLetter_whenInputStringContainsMultipleSameLetter() {
        Reverse reverse = new Reverse();
        assertEquals("PPPPP", reverse.reverseString("PPPPP"));
    }

    @Test
    void reverseString_shouldReturnReversedMixedSameCharacterInLowerAndUpperCases_whenInputStringContainsMixedSameCharacterInLowerAndUpperCases() {
        Reverse reverse = new Reverse();
        assertEquals("PPPPppppPPPpppPPppPp", reverse.reverseString("pPppPPpppPPPppppPPPP"));
    }

    @Test
    void reverseString_shouldReturnReversedWordWithDifferentLettesr_whenInputStringContainsWordWithDifferentLettesr() {
        Reverse reverse = new Reverse();
        assertEquals("scitengamordyh", reverse.reverseString("hydromagnetics"));
    }

    @Test
    void reverseString_shouldReturnOnlySymbols_whenInputStringContainsOnlySymbols() {
        Reverse reverse = new Reverse();
        assertEquals("!@#$%^&*()_+~|/?", reverse.reverseString("!@#$%^&*()_+~|/?"));
    }

    @Test
    void reverseString_shouldReturnReversedSeveralWords_whenInputStringContainsSeveralWords() {
        Reverse reverse = new Reverse();
        assertEquals("liN enis ongam ativ erobal tided subilatrom",
                reverse.reverseString("Nil sine magno vita labore dedit mortalibus"));
    }
}
