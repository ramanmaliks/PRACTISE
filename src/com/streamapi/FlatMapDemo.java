package com.streamapi;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * FlatMap Demo
 * Map Demo using same as Flat Map
 */
public class FlatMapDemo {

	public static void main(String[] args) {
		System.out.println("Using toMap when Key is duplicate");
		Map<String, List<Integer>> arr = new HashMap<String, List<Integer>>();
				arr.put("Raman",Arrays.asList(9394394,9343993));
		
		Map<String,List<String>> strList2= new HashMap<>();
		strList2.put("Raman", Arrays.asList("989","990"));
		strList2.put("Malik", Arrays.asList("889","890"));
		strList2.put("Vivaan", Arrays.asList("789","790"));

		// FLATMAP
		List<String> strList3 = strList2.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println("FlatMap "+ strList3);
		
		// FLATMAP in Single Line
		strList2.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
		// MAP
		List<Stream<String>> strList4 = strList2.values().stream().map(Collection::stream).collect(Collectors.toList());
		strList4.forEach((phones)-> {
			List<String> allPhone = phones.collect(Collectors.toList());
			System.out.println("strList4 "+ allPhone);		});

		// MAP IN 2 LINES 
		List<Stream<String>> strList5 = strList2.values().stream().map(Collection::stream).collect(Collectors.toList());
		strList5.forEach((phones)-> phones.forEach(System.out::println));
		
		// MAP IN SINGLE LINE
		strList2.values().stream().map(Collection::stream).forEach((o)-> o.forEach(System.out::println));;
		

	}

}
