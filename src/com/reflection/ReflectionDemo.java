package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionDemo {
	public static void main(String args[]) throws Exception {
		//Object obj = null;

		ReflectionTest reflectionTest = new ReflectionTest();
		Class myCls = reflectionTest.getClass();
		System.out.println("The name of class is " + myCls.getName());
		Constructor constructor = myCls.getConstructor();
		System.out.println("The name of constructor is " + constructor.getName());
		System.out.println("The public methods of class are : ");
		Method[] methods = myCls.getMethods();
		for (Method method : methods)
			System.out.println("Methods  "+method.getName());
		Method methodcall1 = myCls.getDeclaredMethod("myMethod2", int.class);
		methodcall1.invoke(obj, 2349);
		Field field = myCls.getDeclaredField("s");
		field.setAccessible(true);
		field.set(obj, "My Country India");
		Method myMethodcall2 = myCls.getDeclaredMethod("myMethod1");
		myMethodcall2.invoke(obj);
		Method myMethodcall3 = myCls.getDeclaredMethod("myMethod3");
		myMethodcall3.setAccessible(true);
		myMethodcall3.invoke(obj);
	}
}