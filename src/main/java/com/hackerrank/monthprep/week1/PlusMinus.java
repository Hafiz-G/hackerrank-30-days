package com.hackerrank.monthprep.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positive = 0, negative = 0, zero = 0;

        for (Integer i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");

        System.out.println(decimalFormat.format((double) positive / arr.size()));
        System.out.println(decimalFormat.format((double) negative / arr.size()));
        System.out.println(decimalFormat.format((double) zero / arr.size()));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}



