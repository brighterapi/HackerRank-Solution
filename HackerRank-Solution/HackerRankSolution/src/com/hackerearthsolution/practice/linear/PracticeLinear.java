/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerearthsolution.practice.linear;

/**
 *
 * @author Milind
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeLinear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int loop = Integer.parseInt(input[0]);
        int find = Integer.parseInt(input[1]);
        String[] arrayInputs = br.readLine().split(" ");
        boolean isFind = false;
        for (int i = loop; i > 0; i--) {
            int temp = Integer.parseInt(arrayInputs[i - 1]);
            if (temp == find) {
                isFind = true;
                System.out.println(i);
                break;
            }
        }
        if (!isFind) {
            System.out.println(-1);
        }
    }
}

