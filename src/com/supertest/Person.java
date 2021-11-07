package com.supertest;

//super class for emp
public class Person {
	int id;
	String name;
	String color="white";

//constructor
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("id :"+ id + " Name :" + name );
	}
}
