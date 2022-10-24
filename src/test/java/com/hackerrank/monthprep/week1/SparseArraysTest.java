package com.hackerrank.monthprep.week1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SparseArraysTest {
    @Test
    public void testSparseArray1() {
        List<String> strings = List.of("aba", "baba", "aba", "xzxb");
        List<String> queries = List.of("aba", "xzxb", "ab");

        List<Integer> result = SparseArrays.matchingStrings(strings, queries);

        assertEquals(List.of(2, 1, 0), result);
    }
}