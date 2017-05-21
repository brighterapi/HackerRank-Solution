package com.hackerranksolution.algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class TheHurdleRace {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int count = height[n-1]-k;
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("0");
        }
        
        
    }
    
}
