package com.hackerrank.monthprep.week1;

import java.util.Arrays;

public class Pangram {
    public static String pangrams(String s) {
        boolean[] arr = new boolean[26];
        Arrays.fill(arr, false);
        for (char c : s.toLowerCase().toCharArray()) {
            if (c != ' ') {
                arr[c - 'a'] = true;
            }
        }
        for (boolean b : arr) {
            if (!b) return "not pangram";
        }
        return "pangram";
    }
}
