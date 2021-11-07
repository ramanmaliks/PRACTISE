package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumArrayStreamMap {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
	      System.out.println("List: Integers " +integers);
	      // sum using arrays as List
	      int temp = 0;
	      for(int i=0; i<integers.size(); i++)
	      {
	    	temp += integers.get(i);
	    	
	    	
	      }
	      System.out.println("Sum of Array using for loop" + temp);
	}

	
}
