package com.thistest;

public class B {
	B() {
//3(b) this() : to invoke current class constructor::.Calling parameterized constructor from default constructor
		this(5);
		System.out.println("hello b....Calling parameterized constructor from default constructor");

	}

	B(int x) {
//3(b) this() : to invoke current class constructor::.Calling parameterized constructor from default constructor
		System.out.println(x + " ...b..Calling parameterized constructor from default constructor");

	}
}
