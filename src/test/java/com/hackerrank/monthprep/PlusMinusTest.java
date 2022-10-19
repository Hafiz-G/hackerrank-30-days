package com.hackerrank.monthprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {

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
    public void testPlusMinus1() {
        PlusMinus.plusMinus(List.of(-4, 3, -9, 0, 4, 1));
        assertEquals("""
                0.500000\r
                0.333333\r
                0.166667""", outContent.toString().trim());
    }

    @Test
    public void testPlusMinus2() {
        PlusMinus.plusMinus(List.of(1, 2, 3, -1, -2, -3, 0, 0));
        assertEquals("""
                0.375000\r
                0.375000\r
                0.250000""", outContent.toString().trim());
    }

}