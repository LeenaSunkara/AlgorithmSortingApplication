package com.felight.java.myapp;

public class WorstCase {
	
	public static void generateDescendingNumbers(int n) {
		
		int[] array = new int[n];

		for(int i=array.length-1; i >= 0; i--) {
			array[i] = i+1;
			System.out.println(array[i]);
		}
	
	}	

}
