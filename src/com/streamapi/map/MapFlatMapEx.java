package com.streamapi.map;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Difference between map() and flatMap()
 */
public class MapFlatMapEx {

	public static void main(String[] args) {

		List<Customer> customers = MapDataBase.getAll();
		// One to One Mapping (1 customer = 1 email)
		//data transformation Customer List to Email List
		List<String> emails = customers.stream()		// converting list to stream
				.map(customer -> customer.getEmail())   //reading single customer from customers list and extracting email id
				.collect(Collectors.toList());   		// storing email id list to  new stream list
		System.out.println(emails); //outPut :[john@gmail.com, smith@gmail.com, peter@gmail.com, kelly@gmail.com]

		List<List<String>> phonenumbers = customers.stream()		// converting list to stream
				.map(customer -> customer.getPhoneNumbers())   //reading single customer from customers list and extracting multiple phonenumbers
				.collect(Collectors.toList());   		// storing phonenumber as array in list to  new stream list
		System.out.println("Phone Number" + phonenumbers); //output: Phone Number[[397937955, 21654725], [234234324, 2342323], [232232323, 33232324], [565656556, 76676767]]

		List<String> phonenumber2 = customers.stream()		// converting list to stream
				.flatMap(customer -> customer.getPhoneNumbers().stream())   //Using FlatMap reading single customer from customers list, extracting multiple phonenumbers
				.collect(Collectors.toList());   		// storing phonenumbers in a single new stream list
		System.out.println("Phone Number" + phonenumber2);	//output:Phone Number[397937955, 21654725, 234234324, 2342323, 232232323, 33232324, 565656556, 76676767]

		customers.stream()		// converting list to stream
				.flatMap(customer -> customer.getPhoneNumbers().stream())   //Using FlatMap reading single customer from customers list, extracting multiple phonenumbers
				.sorted()
				.forEach(System.out::println);// storing phonenumbers in a single new stream list


	}

}
