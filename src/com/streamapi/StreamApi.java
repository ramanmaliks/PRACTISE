package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	public static void main (String[] args) {
		// Create a List and filter all even number from list
		// this list.of is immumatible i.e. cannot addafter declaring
		List<Integer> list1 = List.of(2,4,50,21,22,67);

		// 2nd method of creating array list
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);

		//3rd method of creating arraylist
		List<Integer> list3 = Arrays.asList(23,567,12,677,24);

		//Without Stream Even Number from List 1

		List<Integer> listEven = new ArrayList<>();

		//foreach
		for(Integer i : list1)
		{
			if(i%2 == 0) {
				listEven.add(i);
			}
		}

		System.out.println("List1" + list1);
		System.out.println("ListEven" + listEven);

	// Using Stream API
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());

		System.out.println("List1" + list1);
		System.out.println("NewList" + newList);

		// Using Stream API in single line
		List<Integer> newList1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("List1" + list1);
		System.out.println("NewList" + newList1);

		// Using Stram API finding Greater than
		List<Integer> newList2 = list1.stream().filter(i->i>40).collect(Collectors.toList());
		System.out.println("List1" + list1);
		System.out.println("NewList" + newList2);

	}

}
