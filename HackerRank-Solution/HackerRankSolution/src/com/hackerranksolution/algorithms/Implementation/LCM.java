package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class LCM {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int lcm = findLCM(a);
        System.out.println("LCM is : " + lcm);

    }

    static int findLCM(int arr[]) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = findLCM(result, arr[i]);
        }
        return result;
    }

    static int findLCM(int a, int b) {
        int max, min, lcm = 1, x;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (int i = 1; i < max; i++) {
            x = max * i;
            if (x % min == 0) {
                lcm = x;
                break;
            }
        }

        return lcm;
    }
    
}
