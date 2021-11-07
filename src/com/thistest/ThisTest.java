package com.thistest;

public class ThisTest {

	public static void main(String[] args) {
		// this: to refer current class(Student.java) instance variable
		Student s1=new Student(111,"ankit refer current class instance variable",5000f);
		Student s2=new Student(112,"sumit refer current class instance variable","java",6000f);
		s1.display();
		s2.display();

		//this: to invoke current class method
		A a=new A();
		a.n();
	//03.(A)this() : to invoke current class constructor :::Calling default constructor from parameterized constructor:
		A a1 = new A(10);
		B b=new B();
	}

}
