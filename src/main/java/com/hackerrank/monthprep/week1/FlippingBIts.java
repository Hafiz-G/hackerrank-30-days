package com.hackerrank.monthprep.week1;

public class FlippingBIts {
    public static long flippingBits(long n) {
        return (long) Math.pow(2, 32) - 1 ^ n;
    }
}
