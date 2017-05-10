package com.hackerranksolution.algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        Arrays.sort(a);

        int highestCount = 0;
        for (int i = 0; i < n; i++) {
            int currentCount = 0;
            for (int j = 0; j <= i; j++) {
                if (Math.abs(a[i] - a[j]) <= 1) {
                    currentCount++;
                    if (currentCount > highestCount) {
                        highestCount = currentCount;
                    }
                }
            }

        }
        System.out.println(highestCount);
    }

}
