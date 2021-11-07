package com.supertest;

//extending Paraent (Super) class Person
public class Emp extends Person {
	float salary;
	String color="Black";
//Constructor
	Emp(int id, String name, float salary) {

		super(id, name);// reusing parent constructor,super is used to invoke parent class constructor.
		this.salary = salary;
		super.display(); //super can be used to invoke parent class method
		System.out.println(" Super Class Instance Variable Color " + super.color); //super is used to refer immediate parent class instance variable
		System.out.println("This Class Instance Variable - Color " + this.color);
	}

	@Override
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

}