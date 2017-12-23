package com.hackerranksolution.datastructure.arrays;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class SparseArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfString = sc.nextInt();
        sc.nextLine();
        String str[]= new String[numberOfString];
        for(int i=0;i<numberOfString;i++){
            str[i] = sc.nextLine();
        }
        int numberOfQuery = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numberOfQuery;i++){
            int count = 0;
            String queryString = sc.nextLine();
            
            for(int j=0;j<str.length;j++){
                if(queryString.equals(str[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
