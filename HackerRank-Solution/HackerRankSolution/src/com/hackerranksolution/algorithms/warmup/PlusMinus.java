package com.hackerranksolution.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int positiveCount = 0, negetiveCount = 0,zeroCount = 0;
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i]<0){
                negetiveCount++;
            }else if(arr[i]>0){
                positiveCount++;
            }else if(arr[i]==0){
                zeroCount++;
            }
        }
        float a=0f,b=0f,c=0f;
        a = (float)positiveCount/n;
        b = (float)negetiveCount/n;
        c = (float)zeroCount/n;
        System.out.printf("%.6f \n",a);
        System.out.printf("%.6f \n",b);
        System.out.printf("%.6f",c);
    }
    
}
