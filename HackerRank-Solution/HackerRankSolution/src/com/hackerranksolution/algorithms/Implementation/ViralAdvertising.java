package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class ViralAdvertising {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int advertiseCount = 5;
        int start = 5;
        for(int i = 2;i <= days;i++){
            int temp = advertiseCount / 2;
            advertiseCount = temp * 3;
            
        }
        System.out.println(advertiseCount);
    }
    
}
