package com.hackerrank.monthprep.week1;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class PermutingTwoArray {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        sort(A);
        B.sort(Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) return "NO";
        }

        return "YES";
    }
}
