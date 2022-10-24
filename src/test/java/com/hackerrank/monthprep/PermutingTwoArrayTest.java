package com.hackerrank.monthprep;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutingTwoArrayTest {
    @Test
    public void testPermutingTwoArrays1() {
        List<Integer> listA = new ArrayList<>(List.of(2, 1, 3));
        List<Integer> listB = new ArrayList<>(List.of(7, 8, 9));
        assertEquals("YES", PermutingTwoArray.twoArrays(10, listA, listB));
    }

    @Test
    public void testPermutingTwoArrays2() {
        List<Integer> listA = new ArrayList<>(List.of(1, 2, 2, 1));
        List<Integer> listB = new ArrayList<>(List.of(3, 3, 3, 4));
        assertEquals("NO", PermutingTwoArray.twoArrays(5, listA, listB));
    }

    @Test
    public void testPermutingTwoArrays3() {
        List<Integer> listA = new ArrayList<>(List.of(7, 6, 8, 4, 2));
        List<Integer> listB = new ArrayList<>(List.of(5, 2, 6, 3, 1));
        assertEquals("NO", PermutingTwoArray.twoArrays(10, listA, listB));
    }
}