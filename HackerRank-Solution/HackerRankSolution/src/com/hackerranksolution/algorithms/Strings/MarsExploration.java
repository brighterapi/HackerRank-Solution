package com.hackerranksolution.algorithms.Strings;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class MarsExploration {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        int cnt = 0;
        for(int i =0;i<S.length(); i+=3){
        
            if(S.charAt(i)!='S'){
                cnt = cnt + 1;
  
            }
            
            if(S.charAt(i+1)!='O'){
                cnt = cnt + 1;
            
            }
            
            if(S.charAt(i+2)!='S'){
                cnt = cnt + 1;
            
            }
        }
        
        System.out.println(cnt);
    }
    
}
