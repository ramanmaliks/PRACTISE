package com.streamapi;

import java.util.stream.Stream;
public class StreamIterator {
	// Java program to demonstrate
	// Stream.iterate method



	    public static void main(String[] args)
	    {


	        // create a stream using iterate
	        Stream
	        	.iterate(10,i -> i <= 200, i -> i * 2)
	        	.forEach(System.out::println);
	    }
	}