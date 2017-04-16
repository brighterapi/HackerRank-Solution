package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class BirthdayChocolate {
    
    static int getWays(int[] squares, int d, int m){
       int result= 0;
       for(int i=0;i<squares.length;i++){
           int c=0;
           for(int j=0;j<m;j++){
               if(i+j<squares.length){
                   c +=squares[i+j];
               }  
           }
           if (c == d) {
               result++;
           }
           
       }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
    
}
