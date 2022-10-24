package com.hackerrank.monthprep.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlippingBItsTest {

    @Test
    public void testFlippingBits1() {
        assertEquals(2147483648L, FlippingBIts.flippingBits(2147483647));
        assertEquals(4294967294L, FlippingBIts.flippingBits(1));
        assertEquals(4294967295L, FlippingBIts.flippingBits(0));
    }

}