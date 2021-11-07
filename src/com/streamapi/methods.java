package com.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class methods {

	public static void main(String[] args) {

		//filter(Predicate)
		// Predicate means boolean value function
		// e->{ return true or false}; in multiple line always use return line, returning true or false
		// e->e>10; automatically return True or False

		//map (function)
		// with the help of MAP we can do operation on each element
		//(function) will return value


		List<String> names = List.of("Aman","Ankit","Abhinav","Durgesh");
		// storing stream in new list object
		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);

		// without storing in new list object , directly printing
		names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);

		List<Integer> numbers = List.of(23,4,2,5,7,4);
		List<Integer> newNumbers =numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		// for each ----- with method reference
		numbers.stream().map(i->i*i).forEach(System.out::println);
		// for each ---- with multiple lines
		numbers.stream().forEach(e -> {
			System.out.println("Numbers " + e);
		});


		// Sort Function
		numbers.stream().sorted().forEach(System.out::println);

		//min funciton
		Integer integer =numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min: " + integer);

		Integer integer1 =numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max: " + integer1);





	}

}
