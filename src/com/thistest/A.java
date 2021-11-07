package com.thistest;

public class A {
	// 02.this: to invoke current class method
	void m() {
		System.out.println("hello m...this: to invoke current class method");
	}

	// 02.this: to invoke current class method
	void n() {
		System.out.println("hello n...this: to invoke current class method");
		// m();//same as this.m()
		this.m();

	}

	A() {
		// 03.(A)this() : to invoke current class constructor :::Calling default
		// constructor from parameterized constructor:
		System.out.println("hello a ...Calling default constructor from parameterized constructor");
	}

	// 03.(A)this() : to invoke current class constructor :::Calling default
	// constructor from parameterized constructor:
	A(int x) {
		this();
		System.out.println(x + " .....Calling default constructor from parameterized constructor");

	}
}
