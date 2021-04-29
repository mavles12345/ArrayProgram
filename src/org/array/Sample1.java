package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {

		
//		  int[] num = { 10, 20, 30, 40, 50 };
//		  
//		  List<Integer> numList = new ArrayList<Integer>();
//		  
//		  numList= Arrays.as
//		  
//		  for (int[] x : asList) {
//		  
//		  System.out.println(x);
//		  
		 
		String[] strArr = { "10", "20", "30", "40", "50" };

		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < strArr.length; i++) {

			System.out.println(strArr[i]);

		}

		List<String> strList = new ArrayList<String>();

		strList = Arrays.asList(strArr);

		System.out.println("Before");

		for (String string : strList) {

			System.out.println(string);

		}

		strArr[0] = "100";

		System.out.println("After insert");

		for (String string : strList) {

			System.out.println(string);

		}

		strList = new ArrayList<String>();

		Collections.addAll(strList, strArr);

		strList.add("200");

		System.out.println("After add");

		for (String string : strList) {

			System.out.println(string);

		}

	}

}