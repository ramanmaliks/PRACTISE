package com.collection.hashtable;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashtablesort {
	    public static void main(String args[])
	    {
	       Hashtable<Integer, String> ht= new Hashtable<>();
	       ht.put(10, "Chaitanya");
	       ht.put(1, "Ajeet");
	       ht.put(11, "Test");
	       ht.put(9, "Demo");
	       ht.put(3, "Anuj");

	       // Get a set of the entries
	       Set set = ht.entrySet();
	       // Get an iterator
	       Iterator i = set.iterator();
	       // Display elements
	       System.out.println("HashTable<integer,String>::the output key-value pairs are in random order. Neither we got insertion order nor the values are sorted based on keys or values.");
	       while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	       }
	         LinkedHashMap<Integer, String> lhm= new LinkedHashMap<>();
	         lhm.put(10, "Chaitanya");
	         lhm.put(1, "Ajeet");
	         lhm.put(11, "Test");
	         lhm.put(9, "Demo");
	         lhm.put(3, "Anuj");

	         // Get a set of the entries
	         Set set1 = lhm.entrySet();
	         // Get an iterator
	         Iterator i1 = set1.iterator();
	         System.out.println("LinkedHashTable<integer,String>::We got the result in the insertion order.");
	         // Display elements
	         while(i1.hasNext()) {
	           Map.Entry me1 = (Map.Entry)i1.next();
	           System.out.print(me1.getKey() + ": ");
	           System.out.println(me1.getValue());

	       }

	         TreeMap<Integer, String> tm= new TreeMap<>();
	         tm.put(10, "Chaitanya");
	         tm.put(1, "Ajeet");
	         tm.put(11, "Test");
	         tm.put(9, "Demo");
	         tm.put(3, "Anuj");
	         // Get a set of the entries
	         Set set2 = tm.entrySet();
	         // Get an iterator
	         //terator i = set2.iterator();
	         i = set2.iterator();
	         // Display elements
	         System.out.println("TreeMap<integer,String>::the output we got is sorted based on the keys.");
	         while(i.hasNext()) {
	           Map.Entry me = (Map.Entry)i.next();
	           System.out.print(me.getKey() + ": ");
	           System.out.println(me.getValue());
	         }
	   }
}