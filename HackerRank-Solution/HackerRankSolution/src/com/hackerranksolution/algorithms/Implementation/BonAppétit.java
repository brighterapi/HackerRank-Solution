package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class BonAppétit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int items[] = new int[n];
        int annaTotal=0;
        
        for(int i=0;i<n;i++){
            items[i] = in.nextInt();
            if(k!=i){
                annaTotal += items[i];
            }
        }
        int chargedItem = in.nextInt();
        if((annaTotal/2)==chargedItem){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(chargedItem-(annaTotal/2));
        }    
    }
}
