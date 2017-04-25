package com.hackerranksolution.algorithms.Implementation;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int total = 0;
        for(int i=0;i<n-1;i++){
            if(i<n && c[i]==c[i+1]){
                total++;
                i = i+1;
            }
        }
        System.out.println(total);
    
    }
}
