package com.hackerranksolution.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class DiagonalDifference {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[][] = new int[n][n];
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
                if (i == j) {
                    d1 = d1 + array[i][j];
                }
                if (i + j == n - 1) {
                    d2 = d2 + array[i][j];
                }
            }
        }

        System.out.println(Math.abs(d1 - d2));

    }
    
}
