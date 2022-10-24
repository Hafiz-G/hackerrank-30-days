package com.hackerrank.monthprep;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlippingMatrixTest {
    @Test
    public void testFlippingMatrix() {
        List<List<Integer>> matrix = List.of(List.of(112, 42, 83, 119), List.of(56, 125, 56, 49), List.of(15, 78, 101, 43), List.of(62, 98, 114, 108));
        int maxSum = FlippingMatrix.flippingMatrix(matrix);
        assertEquals(414, maxSum);
    }

}