package com.streamapi;

/* Using Collect toList, toSet, toMap, toConcurrentMap 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(15);
		arrList.add(52);
		// toList Demo (array list >10 -> list
		System.out.println("*********Using toList***********");
		List<Integer> newCollectDemoList = arrList.stream().filter(i -> i > 10).collect(Collectors.toList());
		newCollectDemoList.forEach(x -> System.out.println("toList Demo" + x));
		System.out.println("*********Using toSet************");
		Set<Integer> newCollectionDemoSet = arrList.stream().filter(i -> i > 10).collect(Collectors.toSet());
		newCollectionDemoSet.forEach(System.out::println);
		System.out.println("*****************Using toMap*************");
		List<String> strList = new ArrayList<String>();
		strList.add("Raman");
		strList.add("bMalik");
		strList.add("Vivaan");
		strList.add("Mansi");
		strList.add("aRakhee");
		Map<Character, String> newCollectionDemoMap = strList.stream()
				.collect(Collectors.toMap(s1 -> s1.charAt(0), s1 -> s1));
		System.out.println(newCollectionDemoMap);
		System.out.println("******************Using toMap when Key is duplicate***************");
		List<String> strList2 = new ArrayList<String>();
		strList2.add("Raman");
		strList2.add("Malik");
		strList2.add("Vivaan");
		strList2.add("Mansi");
		strList2.add("Rakhee");
		strList2.add("RAM");
		strList2.add("rAM");
		Map<Character, String> newCollectionDemoMap1 = strList2.stream()
				.collect(Collectors.toMap(s1 -> s1.charAt(0), s1 -> s1, (s1, s2) -> s1 + "|" + s2));
		System.out.println(newCollectionDemoMap1);

		System.out.println("*********************Using toConCurrentMap when key is duplicate******************");
		List<String> strList1 = new ArrayList<String>();
		strList1.add("Raman");
		strList1.add("Malik");
		strList1.add("Vivaan");
		strList1.add("Mansi");
		strList1.add("Rakhee");
		Map<Character, String> newCollectionDemoConCuMap = strList1.stream().collect(
				Collectors.toConcurrentMap(s1 -> s1.charAt(0), String::toUpperCase, (s1, s2) -> s1 + "|" + s2));
		System.out.println(newCollectionDemoConCuMap);

	}

}
