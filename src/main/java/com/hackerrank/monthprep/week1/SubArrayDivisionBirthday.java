package com.hackerrank.monthprep.week1;

import java.util.List;

public class SubArrayDivisionBirthday {
    public static int birthday(List<Integer> s, int d, int m) {
        int i = 0, j = m - 1, count = 0;
        while (j < s.size()) {
            if (getSum(s, i, j) == d) {
                count++;
            }
            i++;
            j++;
        }
        return count;
    }

    private static int getSum(List<Integer> list, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
