package com.hackerrank.monthlyprep.week2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer sock : ar) {
            if(map.containsKey(sock)){
                map.put(sock, map.get(sock)+1);
            }else{
                map.put(sock, 1);
            }
        }
        int pairs = 0;
        for (Integer count : map.values()) {
            pairs += count/2;
        }
        return pairs;
    }
}
