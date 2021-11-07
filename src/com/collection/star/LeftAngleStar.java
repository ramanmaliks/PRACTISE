package com.collection.star;

public class LeftAngleStar {

	public static void main(String[] args) {
		int row = 5;
		int temp = 1;
		int r = 1;
		for (int i =1; i<=row; i++)
		{
			for (int j=1; j<=i;j++) {
				System.out.print("* ");
				temp++;
			}
			System.out.println();
		}
		for (int i =1; i<=row; i++)
		{
			for (int j=row -1; j>=i;j--) {
				System.out.print("* ");
				temp++;
			}
			System.out.println();
		}
	}

}
