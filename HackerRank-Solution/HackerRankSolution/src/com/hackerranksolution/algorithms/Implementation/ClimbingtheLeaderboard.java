package com.hackerranksolution.algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Milind
 */
class ClimbingtheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];

        Set<Integer> scortedSet = new HashSet<Integer>();

        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
            scortedSet.add(scores[scores_i]);
        }

        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }

        List<Integer> sortedList = new ArrayList<Integer>(scortedSet);
        Collections.sort(sortedList, Collections.reverseOrder());

        int ind;
        for (int i = 0; i < m; i++) {
            ind = Collections.binarySearch(sortedList, alice[i], Collections.reverseOrder());
            if (ind < 0) {
                ind = Math.abs(ind);
            } else {
                ind++;
            }
            System.out.println(ind);
        }
    }

}
