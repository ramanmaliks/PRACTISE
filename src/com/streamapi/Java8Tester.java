package com.streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Tester {

   public static void main(String args[]) {
      System.out.println("Using Java 8: ");
      long count;
      List<String> filtered;
      String mergedString;
      List<Integer> squaresList;
      // Count empty strings
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      System.out.println("List: " +strings);


      count = strings.stream().filter(string->string.isEmpty()).count();
      System.out.println("Empty Strings: " + count);

      count = strings.stream().filter(string -> string.length() == 3).count();
      System.out.println("Strings of length 3: " + count);
    //Eliminate empty string
      filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
      System.out.println("Filtered List: " + filtered);
	  //Eliminate empty string and join using comma.
      mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
      System.out.println("Merged String: " + mergedString);




      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

      //get list of square of distinct numbers

      squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
      System.out.println("List:Numbers " +numbers);

      System.out.println("Squares List of Numbers: " + squaresList);

      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
      System.out.println("List: Integers " +integers);

      IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

      System.out.println("Highest number in List : " + stats.getMax());
      System.out.println("Lowest number in List : " + stats.getMin());
      System.out.println("Sum of all numbers : " + stats.getSum());
      System.out.println("Average of all numbers : " + stats.getAverage());
      System.out.println("Count of all numbers : " + stats.getCount());

      System.out.println("Random Numbers: ");
      Random random = new Random();
      random.ints().limit(10).sorted().forEach(System.out::println);

      //parallel processing
      count = strings.parallelStream().filter(string -> string.isEmpty()).count();
      System.out.println("Empty Strings: " + count);
   }

}