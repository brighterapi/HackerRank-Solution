package com.hackerranksolution.algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class GCF {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int gcf = findGCF(b);
        System.out.println("GCF is : "+gcf);
    }
    
    static int findGCF(int arr[]){
        int result = arr[0];
        for(int i = 1;i<arr.length;i++){
            result = findGCF(result,arr[i]);
        }
        return result;
    }
    
    static int findGCF(int a,int b){
        int gcf = 1;
        List<Integer> numberList = new ArrayList<>();
        numberList.add(a);
        numberList.add(b);
        
        Integer maxNumber = Collections.max(numberList);
        
        for(int i = maxNumber; i> 1;i--){
            boolean check = false;
            for( int j = 0;j<numberList.size();j++){
                if(numberList.get(j)%i==0){
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }
            if(check){
                for(int j = 0;j<numberList.size();j++){
                    numberList.set(j, numberList.get(j)/i);
                }
                gcf *= i;
                maxNumber = Collections.max(numberList);
            }
        }
        
        return gcf;
    }
    
}
