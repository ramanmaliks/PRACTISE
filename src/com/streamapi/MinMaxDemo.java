package com.streamapi;
/* Using Min Max on stream, with filter stream, with map stream 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(255);
		arrList.add(15);
		arrList.add(523);
		
		System.out.println("Using Min on filtered Stream");	
		Optional<Integer> newMinMaxDemo= arrList.stream().filter(i -> i>120).min((i1,i2)->i1.compareTo(i2));
		System.out.println(newMinMaxDemo);
	
		System.out.println("Using Min on a Stream");	
		newMinMaxDemo= arrList.stream().min((i1,i2)->i1.compareTo(i2));
		System.out.println(newMinMaxDemo);

		System.out.println("Using Min on map Stream");	
		newMinMaxDemo= arrList.stream().map(i -> i*i).min((i1,i2)->i1.compareTo(i2));
		System.out.println(newMinMaxDemo);

		System.out.println("Using Max on filtered Stream");	
		newMinMaxDemo= arrList.stream().filter(i -> i>120).max((i1,i2)->i1.compareTo(i2));
		System.out.println(newMinMaxDemo);
	
		System.out.println("Using Max on a Stream");	
		newMinMaxDemo= arrList.stream().max((i1,i2)->i1.compareTo(i2));
		System.out.println(newMinMaxDemo);

		System.out.println("Using Max on map Stream");	
		newMinMaxDemo= arrList.stream().map(i -> i*i).max((i1,i2)->i1.compareTo(i2));
		System.out.println(newMinMaxDemo);

	}
}
