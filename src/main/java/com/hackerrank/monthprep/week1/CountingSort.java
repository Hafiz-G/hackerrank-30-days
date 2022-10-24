package com.hackerrank.monthprep.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(100, 0));
        for (Integer n : arr) {
            list.set(n, list.get(n) + 1);
        }
        return list;
    }
}
