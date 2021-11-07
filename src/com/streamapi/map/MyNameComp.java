package com.streamapi.map;

import java.util.Comparator;

public class MyNameComp implements Comparator<Customer> {

	@Override
	public int compare(Customer obj1, Customer obj2) {

			  // Sort TreeMap based on name
			  return obj1.getName().compareTo(obj2.getName());

			  // Sort TreeMap based on salary
//			  if(obj1.getSalary() > obj2.getSalary()) return 1;
//			  else if(obj1.getSalary() < obj2.getSalary()) return -1;
//			  else return 0;

	}

}
