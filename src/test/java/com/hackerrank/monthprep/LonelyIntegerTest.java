package com.hackerrank.monthprep;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LonelyIntegerTest {

    @Test
    public void testLonelyIntege1r() {
        int lonelyinteger = LonelyInteger.lonelyinteger(List.of(1));
        assertEquals(1, lonelyinteger);
    }

    @Test
    public void testLonelyInteger2() {
        int lonelyinteger = LonelyInteger.lonelyinteger(List.of(1, 1, 2));
        assertEquals(2, lonelyinteger);
    }

    @Test
    public void testLonelyInteger3() {
        int lonelyinteger = LonelyInteger.lonelyinteger(List.of(0, 0, 1, 2, 1));
        assertEquals(2, lonelyinteger);
    }
}