package com.hackerrank.monthprep.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PangramTest {

    @Test
    public void testPangram() {
        assertEquals("pangram", Pangram.pangrams("We promptly judged antique ivory buckles for the next prize"));
        assertEquals("not pangram", Pangram.pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}