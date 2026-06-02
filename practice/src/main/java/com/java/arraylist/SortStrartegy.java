package com.java.arraylist;

public class SortStrartegy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface SortingStrategy{
	void sort(int[] arr);
}
class BubbleSort implements SortingStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Array "+arr+"Sorted using bubble sort");
	}
	
}
class MergeSort implements SortingStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Array "+arr+"Sorted using merge sort");
	}
	
}
class QuickSort implements SortingStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Array "+arr+"Sorted using quick sort");
	}
	
}
class SortingDecider {
	SortingStrategy sorting;
}