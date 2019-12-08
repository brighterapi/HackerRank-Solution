package com.hackerranksolution.interviewkit.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RepetedString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String string = br.readLine();
        long n = Long.parseLong(br.readLine());
        System.out.println(repetedString(string, n));
    }

    public static long repetedString(String str, long n) {
        long multiply = (n / str.length());
        int aCount = 0;
        char[] stringCharArray = str.toCharArray();
        for (Character ch : stringCharArray) {
            if (ch == 'a') {
                aCount++;
            }
        }
        long totalCount = multiply * aCount;
        long remaining = n - (multiply * stringCharArray.length);
        for (int i = 0; i < remaining; i++) {
            if (str.charAt(i) == 'a') {
                totalCount++;
            }
        }
        return totalCount;
    }
}
