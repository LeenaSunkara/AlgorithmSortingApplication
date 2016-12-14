package com.felight.java.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.felight.java.sort.BenchmarkAll;
import com.felight.java.sort.BubbleSort;
import com.felight.java.sort.HeapSort;
import com.felight.java.sort.InsertionSort;
import com.felight.java.sort.MergeSort;
import com.felight.java.sort.QuickSort;
import com.felight.java.sort.SelectionSort;

public class MyApp {

	public static void main(String[] felight) {
		MyApp app = new MyApp();
		app.execute();
	}

	public void execute() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		try {
		int arraySize = in.nextInt();		
		
			int[] userArray = new int[arraySize];
			
			boolean isValidComplexity = false;
			System.out.println("Choose the Complexity");
			
			while (!isValidComplexity) {
				System.out.println("1. Best Case");
				System.out.println("2. Average Case");
				System.out.println("3. Worst Case");

				int complexity = in.nextInt();

				switch (complexity) {
				case 1:
					BestCase.generateNumbers(arraySize);
					isValidComplexity = true;
					break;

				case 2:
					AverageCase.generateRandomNumbers(arraySize);
					isValidComplexity = true;
					break;

				case 3:
					WorstCase.generateDescendingNumbers(arraySize);
					isValidComplexity = true;
					break;
				default:
					System.out.println("Please enter a valid number from below:");

				}

				if (isValidComplexity)
					System.out.println("Array of size " + arraySize + " is generated for " + complexity + " scenario");

			}
		
			boolean isValidAlgorithm = false;
			System.out.println("Choose Algorithm");
			
			while (!isValidAlgorithm) {
				System.out.println("1.Bubble sort");
				System.out.println("2.Selection sort");
				System.out.println("3.Merge sort");
				System.out.println("4.insertion sort");
				System.out.println("5.Quick sort");
				System.out.println("6.Heap sort");
				System.out.println("7.BenchmarkAll");
				System.out.println("8.Start Over");
				System.out.println("9.Exit");

				int algorithm = in.nextInt();
				switch (algorithm) {
				case 1:
					BubbleSort bubbleSort = new BubbleSort();
					bubbleSort.sort(userArray);
					isValidAlgorithm = true;
					execute();
					break;
				case 2:
					SelectionSort selectionSort = new SelectionSort();
					selectionSort.sort(userArray);
					isValidAlgorithm = true;
					break;
				case 3:
					MergeSort mergeSort = new MergeSort();
					mergeSort.sort(userArray);
					isValidAlgorithm = true;
					break;
				case 4:
					InsertionSort insertionSort = new InsertionSort();
					insertionSort.sort(userArray);
					isValidAlgorithm = true;
					break;
				case 5:
					QuickSort quickSort = new QuickSort();
					quickSort.sort(userArray);
					isValidAlgorithm = true;
					break;
				case 6:
					HeapSort heapSort = new HeapSort();
					heapSort.sort(userArray);
					isValidAlgorithm = true;
					break;
				case 7:
					BenchmarkAll bench = new BenchmarkAll();
					bench.benchmark(userArray);
					isValidAlgorithm = true;
					break;
				case 8:
					execute();
					isValidAlgorithm = true;
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("Please enter a valid number from below:");
				}
			}
		} catch (NegativeArraySizeException e) {
			System.out.println("Please enter a number greater than zero");
			execute();
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number");
			execute();
		} finally {
			in.close(); 
		}
	
	}

}
