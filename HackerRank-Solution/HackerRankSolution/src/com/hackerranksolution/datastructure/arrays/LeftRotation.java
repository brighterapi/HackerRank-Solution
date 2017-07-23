package com.hackerranksolution.datastructure.arrays;

import java.util.Scanner;
/**
 * 
 * @author BrighterAPI
 */
public class LeftRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rotation = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		/**
		 * Iterating first loop which start from rotation value and
		 * finish it till end 
		 */
		
		int[] crtArray = new int[n];
		int cnt = 0;
		for(int i=rotation;i<arr.length;i++){
			crtArray[cnt] = arr[i];
			cnt++;
		}
		
		/**
		 * after putting all other value of an array 
		 * it will start from 0 and till the end 
		 */
		int count = arr.length - rotation;
		for(int i=0;i<rotation;i++){
			crtArray[count] = arr[i];
			count++;
		}
		
		for(int i=0;i<crtArray.length;i++){
			System.out.print(crtArray[i] + " ");
		}

	}

}
