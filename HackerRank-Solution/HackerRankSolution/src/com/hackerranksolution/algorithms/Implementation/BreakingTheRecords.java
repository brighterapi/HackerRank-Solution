package com.hackerranksolution.algorithms.Implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class BreakingTheRecords {
    
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
      
       static int[] getRecord(int[] s){
        int result[] = new int[2];
        HashMap<Integer,Integer> highest = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> lowest = new HashMap<Integer, Integer>();
        highest.put(0, s[0]);
        lowest.put(0, s[0]);
        for(int i=1;i<s.length;i++){
            
            if(s[i]>highest.get(highest.size()-1)){
                highest.put(highest.size(), s[i]);
            }
            if(s[i]<lowest.get(lowest.size()-1)){
                lowest.put(lowest.size(), s[i]);
            }
        }
        result[0] = highest.size()-1;
        result[1] = lowest.size()-1;
        return result;
    }
    
}
