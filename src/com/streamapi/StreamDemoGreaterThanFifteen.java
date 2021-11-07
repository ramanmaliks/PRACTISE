/**
 * Created By : Raman Malik
 * 03-Nov-2021
 * @author Raman Malik Purpose : Finding greater than 15 without using Stream
 *         and then using Stream
 *
 *			List<Integer> strArr = new ArrayList<Integer>();
 *			strArr =  arrList.stream().filter(i -> i>=15).collect(Collectors.toList());
 *			strArr.forEach(System.out::println); // printing using method reference
 *			strArr.stream().forEach(x -> System.out.println("Stream"+x)); // printing using lambda expression.
 *			arrList.stream().filter(i -> i>=15).forEach(System.out::println); // without creating arraylist, directly printing.
 *
 */
package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamDemoGreaterThanFifteen {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(15);
		arrList.add(25);

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Without Stream, \nPress 2 for with Stream ");
		int streamInp = sc.nextInt();
		switch (streamInp) {
		case 1:
			
			
		
		List<Integer> arrListFromMethod = findElement(arrList);
		for(Integer i : arrListFromMethod) {
			System.out.println(i);
		}

		break;
		case 2:
			// using stream
			
			List<Integer> strArr = new ArrayList<Integer>();
			strArr =  arrList.stream().filter(i -> i>=15).collect(Collectors.toList());
			strArr.forEach(System.out::println); // printing using method reference
			strArr.stream().forEach(x -> System.out.println("Stream"+x)); // printing using lambda expression.
			arrList.stream().filter(i -> i>=15).forEach(System.out::println); // without creating arraylist, directly printing.
		break;	
		default:
			break;
		}
}

	private static List<Integer> findElement(List<Integer> arrList) {
		List<Integer> newArrList =  new ArrayList<Integer>();
		for(Integer i : arrList) {
			if(i>=15) {
				newArrList.add(i);
				
			}
		}
		return newArrList;
	}

}
