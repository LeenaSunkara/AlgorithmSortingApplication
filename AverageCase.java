package com.felight.java.myapp;

public class AverageCase {
	
	public static void generateRandomNumbers(int n){
		
		int[] array = new int[n];
		for(int i=0; i < array.length; i++){
			array[i] = (int) (Math.random()*10000);
			System.out.println(array[i]);
		}
			
	}

}
