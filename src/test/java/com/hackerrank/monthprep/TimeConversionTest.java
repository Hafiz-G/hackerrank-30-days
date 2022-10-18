package com.hackerrank.monthprep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    @Test
    public void testTimeConversion1() {
        String result = TimeConversion.timeConversion("12:00:00AM");
        assertEquals("00:00:00", result);
    }

    @Test
    public void testTimeConversion2() {
        String result = TimeConversion.timeConversion("3:00:00AM");
        assertEquals("03:00:00", result);
    }

    @Test
    public void testTimeConversion3() {
        String result = TimeConversion.timeConversion("3:00:00PM");
        assertEquals("15:00:00", result);
    }

    @Test
    public void testTimeConversion4() {
        String result = TimeConversion.timeConversion("12:00:00PM");
        assertEquals("12:00:00", result);
    }

}