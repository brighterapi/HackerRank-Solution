package com.hackerranksolution.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class CompareTriplets {
    
       
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] alicePoints = new int[3];
        for(int i = 0;i<3;i++){
            alicePoints[i] = in.nextInt();
        }
        int[] bobPoints = new int[3];
        for(int i = 0;i<3;i++){
            bobPoints[i] =in.nextInt();
        }
        int aliceResult = 0;
        int bobResult = 0;
        
        for(int i = 0;i<3;i++){
            if(alicePoints[i]>bobPoints[i]){
                aliceResult++;
            }else if(alicePoints[i]<bobPoints[i]){
                bobResult++;
            }
        }
        
        in.close();
        System.out.print(aliceResult+" "+bobResult);
        
    }
    
}
