package com.streamapi;
/* Using count on stream, with filter stream, with map stream 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(15);
		arrList.add(52);
		
		System.out.println("Using Count on filtered Stream");	
		Long newCountDemo= arrList.stream().filter(i -> i>10).count();
		System.out.println(newCountDemo);

		System.out.println("Using Count on Stream");	
		newCountDemo= arrList.stream().count();
		System.out.println(newCountDemo);

		System.out.println("Using Count on map Stream");	
		newCountDemo= arrList.stream().map(i -> i*i).count();
		System.out.println(newCountDemo);

	}
}
