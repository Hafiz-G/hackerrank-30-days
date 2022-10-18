package com.hackerrank.monthprep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class TimeConversion {

    public static String timeConversion(String s) {
        String[] time = s.split(":");
        int hour = Integer.parseInt(time[0]);

        if (hour < 12 && s.endsWith("PM")) hour += 12;
        if (hour == 12 && s.endsWith("AM")) hour = 0;
        DecimalFormat df = new DecimalFormat("00");

        return df.format(hour) + ':' + time[1] + ':' + time[2].substring(0, 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        System.out.println(result);
        bufferedReader.close();
    }

}


