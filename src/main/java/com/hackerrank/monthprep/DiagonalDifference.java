package com.hackerrank.monthprep;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0, rightSum = 0;
        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.get(row).size(); col++) {
                if (row == col) {
                    leftSum += arr.get(row).get(col);
                }
                if (row + col == arr.size() - 1) {
                    rightSum += arr.get(row).get(col);
                }
            }
        }
        return Math.abs(leftSum - rightSum);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

