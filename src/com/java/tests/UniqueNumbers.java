package com.java.tests;

import java.util.ArrayList;

//Duplicate Element in given array
public class UniqueNumbers {

	public static void main(String[] args) {
		int[] arr2 = new int[12];
		int l = 0;
		ArrayList<Integer> al = new ArrayList<>();
		int[] arr = new int[] {1,2,3,4,4,6,5,7,8,8,3,2};
		System.out.println("Int Arr ="+ arr[1]);
		System.out.println("Length of Arr ="+ arr.length);
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
				arr2[l++]=arr[i];
				al.add(arr[i]);  // List of Array which are duplicate found
			}

			}

		}
		System.out.println("Array List " + al);

		for (int element : arr2) {
			if(element!=0)
			System.out.println("as" + element);

		}
	}

}
