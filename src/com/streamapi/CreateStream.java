package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(15);
		arrList.add(25);
	
		Stream s = arrList.stream(); // CREATING A STREAM OBJECT
	}

}
