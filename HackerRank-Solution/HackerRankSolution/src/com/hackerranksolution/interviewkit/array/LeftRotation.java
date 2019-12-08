package com.hackerranksolution.interviewkit.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class LeftRotation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String[] nd = br.readLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] result = rotLeft(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    static int[] rotLeft(int[] a, int d) {
        int[] array = new int[a.length];
        int arrayCount = 0;
        for (int i = d; i < a.length; i++) {
            array[arrayCount] = a[i];
            arrayCount++;
        }
        for (int i = 0; i < d; i++) {
            array[arrayCount] = a[i];
            arrayCount++;
        }
        return array;
    }

}
