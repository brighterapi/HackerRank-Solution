package com.hackerranksolution.Interviewkit.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];
        String cItems[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] array) {
        int cnt = 0;
        int concecutive = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 1) {
                cnt++;
                concecutive = 0;
            } else if (array[i] == 0 && array[i + 1] == 0) {
                if (concecutive == 0) {
                    cnt++;
                    concecutive++;
                } else if (concecutive == 1) {
                    concecutive = 0;
                }
            }

        }

        return cnt;
    }

}
