package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class GradingStudents {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            int grade = in.nextInt();
                if(grade < 38){
                    arr[i] = grade;
                }else{
                    int f1 = grade + 1;
                    int f2 = grade + 2;
                    if(f1%5==0){
                        arr[i] = f1;
                    }else if(f2 %5==0){
                        arr[i] = f2;
                    }else{
                        arr[i] = grade;
                    }
                }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
