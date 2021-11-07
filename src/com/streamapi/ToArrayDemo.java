package com.streamapi;
/* Using toArray on filter stream,
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(255);
		arrList.add(15);
		arrList.add(523);
		
		System.out.println("Using toArray on filtered Stream converting to an object Array");	
		Object[] newToArrayDemo= arrList.stream().filter(i -> i>120).toArray();
		for(Object o : newToArrayDemo)
			{System.out.println("Element in array "+o);
		}
	}
}