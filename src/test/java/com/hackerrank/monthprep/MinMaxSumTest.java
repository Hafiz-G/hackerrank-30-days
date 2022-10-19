package com.hackerrank.monthprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinMaxSumTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMinMaxSum1() {
        MinMaxSum.miniMaxSum(List.of(1, 2, 3, 4, 5));
        assertEquals("10 14", outContent.toString().trim());
    }

    @Test
    public void testMinMaxSum2() {
        MinMaxSum.miniMaxSum(List.of(7, 69, 2, 221, 8974));
        assertEquals("299 9271", outContent.toString().trim());
    }
}