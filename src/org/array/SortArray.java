package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {

		int[] num = { 100, 10, 20, 30, 40, 50 };
		int[] num1;
		
		int[]num2= {10,20,30,40};
		
		//System.out.println("orignal array"+ Arrays.toString(num1));
		
		int[] copy=Arrays.copyOf(num, 8);
		
	//	copy[6]=200;
		
		//copy[7]=300;
		
		System.out.println("after adding");
		
		for (int i = 0; i < copy.length; i++) {
			
			System.out.println(copy[i]);
			
		}

	

	}

}
