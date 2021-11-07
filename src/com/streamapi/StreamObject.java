package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// Stream API - Collection Prpcess
		// Collection / group of object / arrays

		// Empty Stream
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e-> {
			System.out.println(e);
		});

		 // STream.of for Array,object,collection
		String name[] = {"Raman","Malik","Vivaan","Divya"};
		Stream<String> stream1 = Stream.of(name);
		stream1.sorted().forEach(System.out::println);
		Stream<String> stream12 = Stream.of(name);
		stream12.forEach(e-> System.out.println(e));

		// Builder function
		Stream<Object> streamBuilder = Stream.builder().build();

		// arrays.stream
		IntStream stream = Arrays.stream(new int[] {2,4,65,3,564});
		stream.forEach(e-> System.out.println(e));

		// Collection--> List, Set
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);

		Stream<Integer> stream2= list2.stream();
		stream2.forEach(e -> System.out.println(e) );

	}
	}


