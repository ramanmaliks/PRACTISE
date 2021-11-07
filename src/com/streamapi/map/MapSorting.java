package com.streamapi.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	map.put("four", 4);
	map.put("ten", 10);
	map.put("two", 2);
	map.put("eight", 8);
	//stream sorting comparing by Key (String Type)
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	//stream sorting comparing by Value (interger Type)
	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


//	  Map<Customer, Integer> customer = new TreeMap<Customer,Integer>(new Comparator<Customer>() {

//	  @Override public int compare(Customer o1, Customer o2) {
//		  return o1.getName().compareTo(o2.getName());
		  //return (int)(o1.getId()-o2.getId());  //printing id in ascending order, for reversal just exchange o1 with o2, o2 with o1
//		  }});

//	Map<Customer, Integer> customer = new TreeMap<>();
//	  Map<Customer, Integer> customer = new TreeMap<Customer,Integer>(new MyNameComp());
//	  Map<Customer, Integer> customer = new TreeMap<Customer,Integer>((o1, o2) -> o1.getName().compareTo(o2.getName())); printing in ascending order

	Map<Customer, Integer> customer = new TreeMap<>((o1, o2) -> o2.getName().compareTo(o1.getName())); // printing in reverse order
		  //return (int)(o1.getId()-o2.getId());
		  //return 0;
		  //}});


	  customer.put(new Customer(23,"John","john@gmail.com"), 100);
	customer.put(new Customer(33,"Kelvin","kelvin@gmail.com"), 200);
	customer.put(new Customer(43,"Aosh","josh@gmail.com"), 300);
	//System.out.println(customer);

	// using stream for sorting in object in ascending order
	System.out.println("***********stream for sorting in object by Name in ascending order**********");
	customer.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Customer::getName))).forEach(System.out::println);
	// using stream for sorting in object in decending order using reversed
	System.out.println("***********stream for sorting in object by Name in decending order using reversed**********");
	customer.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Customer::getName).reversed())).forEach(System.out::println);
	System.out.println("***********stream for sorting in object by ID in decending order **********");
	customer.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Customer::getId))).forEach(System.out::println);
	System.out.println("***********stream for sorting in object by ID in decending order using reversed**********");
	customer.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Customer::getId).reversed())).forEach(System.out::println);
	System.out.println("***********stream for sorting in object by EMAIL in decending order **********");
	customer.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Customer::getEmail))).forEach(System.out::println);
	System.out.println("***********stream for sorting in object by EMAIL in decending order using reversed**********");
	customer.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Customer::getEmail).reversed())).forEach(System.out::println);

}
}
