package com.thistest;

public class Student {
	int rollno;
	String name,course;
	float fee;

	//this: to refer current class instance variable
	Student(int rollno, String name, float fee) {
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
//3(c):Real usage of this() constructor call
	Student(int rollno,String name,String course,float fee){
		this(rollno,name,fee);//reusing constructor
		this.course=course;
		}
	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}