package com.hartmanmark.reverseapp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseTest {

    @Test
    void testLowUpperCase() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA fedCBA fedcba", 
                reverse.reverseString("ABCDEF ABCdef abcdef"));
    }

    @Test
    void testNumbers() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA123 fedCBA123 fedcba123", 
                reverse.reverseString("ABCDEF123 ABCdef123 abcdef123"));
    }

    @Test
    void testSymbols() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA!@#$%^&*() fedCBA!@#$%^&*() fedcba!@#$%^&*()",
                reverse.reverseString("ABCDEF!@#$%^&*() ABCdef!@#$%^&*() abcdef!@#$%^&*()"));
    }

    @Test
    void testAll() {
        Reverse reverse = new Reverse();
        assertEquals("FEDCBA123!@#$%^&*() fedCBA123!@#$%^&*() fedcba123!@#$%^&*()",
                reverse.reverseString("ABCDEF123!@#$%^&*() ABCdef123!@#$%^&*() abcdef123!@#$%^&*()"));
    }

    @Test
    void testLontText() {
        Reverse reverse = new Reverse();
        assertEquals(
                "ehT nepO ecruoS noitinifeD stneserp na ecru-osnepo yhposolihp"
                        + " dna rehtruf senifed eht smret fo esu,"
                        + " noitacifidom dna noitubirtsider fo ecru-osnepo erawtfos. "
                        + "erawtfoS sesnecil tnarg sthgir ot sresu "
                        + "hcihw dluow esiwrehto eb devreser yb thgirypoc wal ot eht "
                        + "thgirypoc redloh. lareveS ecru-osnepo " 
                        + "erawtfos sesnecil evah deifilauq nihtiw "
                        + "eht seiradnuob fo eht nepO ecruoS noitinifeD. ehT tsom "
                        + "tnenimorp dna ralupop elpmaxe si eht UNG lareneG cilbuP "
                        + "esneciL (LPG), hcihw \"swolla eerf noitubirtsid "
                        + "rednu eht noitidnoc taht rehtruf stnempoleved dna "
                        + "snoitacilppa era tup rednu eht emas ecnecil\", suht osla eerf.",
                reverse.reverseString("The Open Source Definition presents an open-source philosophy "
                        + "and further defines the terms of use, "
                        + "modification and redistribution of open-source software. "
                        + "Software licenses grant rights to users "
                        + "which would otherwise be reserved by copyright law to the "
                        + "copyright holder. Several open-source"
                        + " software licenses have qualified within the boundaries of "
                        + "the Open Source Definition. The most"
                        + " prominent and popular example is the GNU General Public "
                        + "License (GPL), which \"allows free distribution"
                        + " under the condition that further developments and "
                        + "applications are put under the same licence\", thus also free."));
    }
}
