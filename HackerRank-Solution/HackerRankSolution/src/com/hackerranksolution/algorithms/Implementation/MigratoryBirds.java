package com.hackerranksolution.algorithms.Implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        Map<Integer, Integer> counType = new HashMap<Integer, Integer>();
        for (int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
            int number = types[types_i];
            if (counType.containsKey(number)) {
                counType.put(number, counType.get(number) + 1);
            } else {
                counType.put(number, 1);
            }
        }
        int max = Collections.max(counType.values());
        if (max != 1) {
            for (Entry<Integer, Integer> entry : counType.entrySet()) {
                if (entry.getValue().equals(max)) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("0");
        }

    }
}
