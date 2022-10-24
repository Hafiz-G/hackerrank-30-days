package com.hackerrank.monthprep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XorStringsTest {
    @Test
    public void testXorStrings() {
        String xor = XorStrings.stringsXOR("10101", "00101");
        assertEquals("10000", xor);
    }

}