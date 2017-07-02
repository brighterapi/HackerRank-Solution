package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class BeautifulDaysattheMovies {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNumber = sc.nextInt();
        int endNumber = sc.nextInt();
        int divisable = sc.nextInt();
        
        int count = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            int reverseNumber = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            int ansVal = Math.abs(i - reverseNumber);
            if(ansVal%divisable==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
