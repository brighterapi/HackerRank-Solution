package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class UtopianTree {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int increment = 1;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    increment = increment * 2;
                }else{
                    increment = increment + 1;
                }
            }
            System.out.println(increment);
        }
        
        
    }    
}
