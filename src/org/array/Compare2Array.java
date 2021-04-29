package org.array;

import java.util.Arrays;

public class Compare2Array {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30 };
		int[] num1 = { 10, 20, 30, 40 };
		int[] num2 = { 10, 20, 30 };

		boolean equals = Arrays.equals(num, num1);
		boolean equals1 = Arrays.equals(num, num2);
		System.out.println(equals);
		System.out.println(equals1);

	}

}
