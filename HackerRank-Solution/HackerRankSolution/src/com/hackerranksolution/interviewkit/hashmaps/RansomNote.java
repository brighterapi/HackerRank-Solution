package com.hackerranksolution.interviewkit.hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String[] mn = br.readLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        String[] magazine = new String[m];
        String[] magazineItems = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }
        String[] note = new String[n];
        String[] noteItems = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }
        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : magazine) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (String str : note) {
            if (map.containsKey(str) && 0 != map.get(str)) {
                map.put(str, map.get(str) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
