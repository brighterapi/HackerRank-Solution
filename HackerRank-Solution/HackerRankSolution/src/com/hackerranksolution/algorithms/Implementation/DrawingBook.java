package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class DrawingBook {

    static int solve(int n, int p) {
        int turns = 0;

        int half = n / 2;
        if (p > half) {
            //From Back
            int back = n - p;
            if (back > 1) {
                turns = back / 2;
            } else if (n % 2 == 0 && back == 1) {
                turns = 1;
            }
        } else //From frount
        if (p > 1) {
            turns = p / 2;
        }

        return turns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
