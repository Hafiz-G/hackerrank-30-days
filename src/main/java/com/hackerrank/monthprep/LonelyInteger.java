package com.hackerrank.monthprep;

import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int result = 0;
        for (Integer i : a) {
            result ^= i;
        }
        return result;
    }
}
