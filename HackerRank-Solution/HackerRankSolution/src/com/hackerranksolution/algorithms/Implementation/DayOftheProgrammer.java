package com.hackerranksolution.algorithms.Implementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class DayOftheProgrammer {

    static String solve(int year) {
        String answerDate = "";
        Calendar ca = Calendar.getInstance();
        if (year < 1918 && year % 100 == 0) {
            answerDate = getAnswerDate(ca, year, 255);
        } else if (year == 1918) {
            answerDate = getAnswerDate(ca, year, 269);
        } else {
            answerDate = getAnswerDate(ca, year, 256);
        }
        return answerDate;
    }

    static String getAnswerDate(Calendar ca, int year, int day) {
        ca.set(ca.YEAR, year);
        ca.set(ca.DAY_OF_YEAR, day);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(ca.getTime());

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
