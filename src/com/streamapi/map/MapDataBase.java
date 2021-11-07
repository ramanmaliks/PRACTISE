package com.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDataBase {

	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101,"john","john@gmail.com",Arrays.asList("397937955","21654725")),
				new Customer(101,"smith","smith@gmail.com",Arrays.asList("234234324","2342323")),
				new Customer(101,"peter","peter@gmail.com",Arrays.asList("232232323","33232324")),
				new Customer(101,"kelly","kelly@gmail.com",Arrays.asList("565656556","76676767"))
				).collect(Collectors.toList());
	}
}
