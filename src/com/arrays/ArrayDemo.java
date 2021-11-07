package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
	// Arrays sorting
		String[] names = {"Raman","Vivaan","Mansi","Rakhee","Malik","Ram"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	// Array sorting in reverse order
		Arrays.sort(names,Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
	//Array aslist
		List<String> namesList = Arrays.asList(names);
		System.out.println(namesList);	// 2 lines of code for printing array as list
		System.out.println(Arrays.asList(names)); // 1 line of code printing String array as list 
	//Array Int  binary search
		int[] a1 = {10,20,60,40,50,30};
		Arrays.sort(a1); // sorting for binary search
		System.out.println(Arrays.toString(a1)); // printing int array using toString
		int a = Arrays.binarySearch(a1, 30); // binary search returning index point 
		System.out.println(a); // if found then index no print else <0 i.e. -ve wil print
		if (a<0) { System.out.println("Not founnd");}
		else { System.out.println("Element found at index no. " + a);}
	//Arrays.compare(null, null)
		//Arrays.equals(null, null)
		//Arrays.deepEquals(args, names)
	
		
	}

}
