package com.streamapi;
/* Using of() on filter stream,
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		System.out.println("Using of() on Stream converting Group of element to Stream");	
		Stream.of(255,15,523).forEach(System.out::println);

		System.out.println("Using of() on Stream converting Group of element String Array to Stream with filter");	
		String[] names = {"Raman","Malik","Vivaan","Mansi"};
		Stream.of(names).filter(x -> x.length() > 4).forEach(System.out::println);
		System.out.println("Using of() on Stream converting Group of element String Array to Stream with map");
		Stream.of(names).map(String::length).forEach(System.out::println);
		
		
	
	
	}
}