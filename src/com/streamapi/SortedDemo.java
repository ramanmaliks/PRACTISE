package com.streamapi;
/* Using Sort on stream, with filter stream, with map stream 
 *  Using Descending Sort on a stream
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(255);
		arrList.add(115);
		arrList.add(523);
		
		System.out.println("Using Sort on filtered Stream");	
		Stream<Integer> newSortDemo= arrList.stream().filter(i -> i>120).sorted();
		newSortDemo.forEach(System.out::println);

		System.out.println("Using Sort on a Stream");	
		newSortDemo= arrList.stream().sorted();
		newSortDemo.forEach(System.out::println);

		System.out.println("Using Sort on Map Stream");	
		newSortDemo= arrList.stream().map(i -> i*i).sorted();
		newSortDemo.forEach(System.out::println);
		
		System.out.println("Using Descending Sort using comparator on a Stream");	
		newSortDemo= arrList.stream().sorted((i1,i2) -> i2.compareTo(i1));
		newSortDemo.forEach(System.out::println);
	}
}
