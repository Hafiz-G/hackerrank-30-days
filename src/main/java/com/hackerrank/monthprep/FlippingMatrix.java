package com.hackerrank.monthprep;

import java.util.List;

public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int max;
        int sum = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                max = Integer.MIN_VALUE;
                max = Math.max(matrix.get(row).get(col), max);
                max = Math.max(matrix.get(row).get(2 * n - col - 1), max);
                max = Math.max(matrix.get(2 * n - row - 1).get(col), max);
                max = Math.max(matrix.get(2 * n - row - 1).get(2 * n - col - 1), max);
                sum += max;
            }
        }
        return sum;
    }
}
