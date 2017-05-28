package com.hackerranksolution.algorithms.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        List<Character> alphabats = new ArrayList<Character>();
        char ch;
        for (ch = 'a'; ch <= 'z'; ch++) {
            alphabats.add(ch);
        }
        Map<Character, Integer> alphaMap = new HashMap<Character, Integer>();
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
            alphaMap.put(alphabats.get(h_i), h[h_i]);
        }
        String word = in.next();
        int highestSize = 0;
        for(int i=0;i<word.length();i++){
            if(highestSize < alphaMap.get(word.charAt(i))){
                highestSize = alphaMap.get(word.charAt(i));
            }
        }
        
        System.out.println(highestSize * word.length());
    }

}
