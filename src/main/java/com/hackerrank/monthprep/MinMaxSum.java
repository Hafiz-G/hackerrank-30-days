package com.hackerrank.monthprep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = 0;
        long sum = 0;

        for (Integer num : arr) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println((sum - max) + " " + (sum - min));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        MinMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}

