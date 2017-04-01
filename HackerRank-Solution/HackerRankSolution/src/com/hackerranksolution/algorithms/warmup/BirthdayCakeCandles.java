package com.hackerranksolution.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int highest = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > highest){
                highest = height[height_i];
            }
        }
        
            int total = 0;
            for(int i =0;i<n;i++){
                if(highest == height[i])
                    total++;
            }
            System.out.println(total);
        
    }
}
