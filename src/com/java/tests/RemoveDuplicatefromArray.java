package com.java.tests;

import java.util.Arrays;

public class RemoveDuplicatefromArray {

	// Java Program to Remove Sorted Duplicate Elements
	// From the Array using extra space


		public static int removeduplicates(int a[], int n)
		{
			if (n == 0 || n == 1) {
				return n;
			}

			// creating another array for only storing
			// the unique elements
			int[] temp = new int[n];
			int j = 0;

			for (int i = 0; i < n - 1; i++) {
				//System.out.println("aii ="+ a[i]);
				if (a[i] != a[i + 1]) {
				//	System.out.println("ai ="+ a[i]);
					temp[j++] = a[i];
				}
			}
			//System.out.println("a ="+ a[n-1] +",n="+n);
			temp[j++] = a[n - 1];

			// Changing the original array
			for (int i = 0; i < j; i++) {
				a[i] = temp[i];
			}

			return j;
		}
		public static void main(String[] args)
		{
			int a[] = { 4,1, 1, 2, 2, 2,3,4 };
			Arrays.sort(a);
			int n = a.length;
			System.out.println(Arrays.toString(a));
			 for(int ai : a) {
				 System.out.println("a="+a[ai]+" ai"+ai);
			 }
			System.out.println(n);

			n = removeduplicates(a, n);
			System.out.println(n);
			// Printing The array elements
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			//for(int i : a) {System.out.println("For Method"+a[i]);};

		}
	}
