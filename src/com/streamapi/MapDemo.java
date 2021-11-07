package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(15);
		arrList.add(52);
	
		Stream s = arrList.stream().map(i -> i*i);
		s.forEach(x -> System.out.println(x));
		//another Method
		System.out.println("Another Method for One Line");
		arrList.stream().map(i->i*i).forEach(System.out::println);
	}

}
