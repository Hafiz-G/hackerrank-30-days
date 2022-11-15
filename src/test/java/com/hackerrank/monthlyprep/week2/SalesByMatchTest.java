package com.hackerrank.monthlyprep.week2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest {

    @Test
    public void testSockMerchant1(){
        List<Integer> list = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int actualCount = SalesByMatch.sockMerchant(list.size(), list);
        assertEquals(3, actualCount);
    }

    @Test
    public void testSockMerchant2(){
        List<Integer> list = List.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        int actualCount = SalesByMatch.sockMerchant(list.size(), list);
        assertEquals(4, actualCount);
    }
}