package com.hackerranksolution.datastructure.arrays;


import java.util.Scanner;

/**
 * @author BrighterAPI
 */
public class HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int count = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i >= arr.length - 2 || j >= arr.length - 2) {

                } else {
                    int temp = 0;
                    int firstTemp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                    int secoundTemp = arr[i + 1][j + 1];
                    int thirdTemp = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                    temp = firstTemp + secoundTemp + thirdTemp;

                    if (temp > count) {
                        count = temp;

                    }
                }

            }
        }
        System.out.println(count);
    }

}
