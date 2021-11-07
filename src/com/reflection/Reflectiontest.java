package com.reflection;

class ReflectionTest {
	private String s;

	public ReflectionTest() {
		s = "Learning Reflection";
	}

	public void myMethod1() {
		System.out.println("The string is " + s);
	}

	public void myMethod2(int n) {
		System.out.println("The number is " + n);
	}

	private void myMethod3() {
		System.out.println("Class private method invoked");
	}
}

