package com.hackerranksolution.algorithms.Strings;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt() % 26;
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + getUpdatedAsciiChar(s.charAt(i), k);
        }
        System.out.println(str);
    }

    static char getUpdatedAsciiChar(char ch, int incremental) {
        if (Character.isLetter(ch)) {
            int i = (int) ch;
            i = i + incremental;

            if (Character.isUpperCase(ch)) {
                if (i > 90) {
                    int num = (int) ch + incremental;
                    i = num - 26;
                }
            } else if (i > 122) {
                int num = (int) ch + incremental;
                i = num - 26;
            }
            return (char) i;
        }
        return ch;
    }

}
