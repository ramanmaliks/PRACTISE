package com.finaltest;

public class FinalMethodTest extends BikeFinalMethod { // as final class , you cannot extend it.
	   void run(){System.out.println("running safely with 100kmph");}  // as final method can cannot be overriden

	   public static void main(String args[]){
	   Honda honda= new Honda();
	   honda.run();
	   }
	}