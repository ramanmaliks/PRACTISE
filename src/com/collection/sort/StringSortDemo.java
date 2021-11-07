package com.collection.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StringSortDemo {

	public static void main(String[] args) {
		// Arrays sorting
		String[] names = {"Raman","Vivaan","Mansi","Rakhee","Malik","Ram"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		// sorting in reverse order
		Arrays.sort(names,Collections.reverseOrder());
		System.out.println(Arrays.toString(names));

	
	//defining an array of type String  
	String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
	int size = countries.length;  
	//logic for sorting   
	for(int i = 0; i<size-1; i++)   
	{  
	for (int j = i+1; j<countries.length; j++)   
	{  
	//compares each elements of the array to all the remaining elements 
	//int r = countries[i].compareTo(countries[j]);
	//System.out.println(r);
	if(countries[i].compareTo(countries[j])>0)   
	{  
	//swapping array elements  
	//System.out.println(countries[i] + " " + countries[j]);
	String temp = countries[i];  
	countries[i] = countries[j];  
	countries[j] = temp;  
	}  
	}  
	}  
	//prints the sorted array in ascending order  
	System.out.println(Arrays.toString(countries));  
	}  

}