package com.hackerranksolution.algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
class ClimbingtheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];

        List<Integer> scoreSet = new ArrayList<Integer>();

        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
        }
        
        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }
        
        int[] rank = new int[n];
        rank[0] = 1;
        for (int i = 1; i < n; i++) {
            if (scores[i] < scores[i - 1]) {
                rank[i] = rank[i - 1] + 1;
            } else {
                rank[i] = rank[i - 1];
            }
        }
        int start = 0, end = n - 1;
        int ind;
        for (int i = 0; i < m; i++) {
            ind = binarySearch(scores, start, end, alice[i]);
            if (ind == -1) {
                System.out.println(rank[n - 1] + 1);
            } else {
                end = ind;
                System.out.println(rank[ind]);
            }
        }
    }

    static int binarySearch(int[] s, int start, int end, int alice) {
        if (alice < s[end]) {
            return -1;
        }
        if (alice >= s[start]) {
            return 0;
        }
        if (end - start <= 1) {
            return end;
        }
        int mid = (start + end) / 2;
        if (s[mid] < alice) {
            return binarySearch(s, start, mid, alice);
        } else if (s[mid] == alice) {
            return mid;
        } else {
            return binarySearch(s, mid, end, alice);
        }
    }
        
    
}
