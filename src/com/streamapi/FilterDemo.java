package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(15);
		arrList.add(52);
	
		Stream s = arrList.stream().filter(i -> i%2 == 0);
		s.forEach(x -> System.out.println(x));
	}

}
