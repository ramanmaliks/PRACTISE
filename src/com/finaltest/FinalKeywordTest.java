package com.finaltest;

public class FinalKeywordTest {

	final int speedlimit = 90;// final variable

	void run() {
		speedlimit = 400; // compile time error as final keyword cannot be assigned.
	}

	public static void main(String args[]) {
		FinalKeywordTest obj = new FinalKeywordTest();
		obj.run();
	}

	}// end of

