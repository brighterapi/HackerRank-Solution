package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;
/**
 *
 * @author Milind
 */
public class AppleandOrange {
    public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		int appleCount =0;
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
			if(a + apple[apple_i]>=s && a + apple[apple_i] <= t){
				appleCount++;
			}
			 
		}
		int[] orange = new int[n];
		int oragngeCount = 0;
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
			if(b + orange[orange_i]>=s && b + orange[orange_i] <=t){
				oragngeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(oragngeCount);
	}
}
