package com.nit.arrays;

import java.util.Scanner;

class Array{
	public void display(int [] nums){
		System.out.println("Original Array: ");
		for(int i = 0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
class Array2 extends Array{
	@Override
	public void display(int [] nums) {
		for(int i = 0;i<nums.length;i++) {
			int key = nums[i];
			int j = i-1;
			while(j>=0 && nums[j]>key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
		System.out.println("\nAscending Order: ");
		for(int i = 0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
class Array3 extends Array2{
	@Override
	public void display(int [] nums) {
		System.out.println("\nDscending Order: ");
		for(int i = nums.length-1;i>=0;i--) {
			System.out.print(nums[i]+" ");
		}
	}
}
public class ExamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size = sc.nextInt();
		int [] nums = new int[size];
		System.out.println("Enter the elements");
		for(int i = 0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		Array arr = new Array();
		arr.display(nums);
		Array2 arr1 = new Array2();
		arr1.display(nums);
		Array3 arr2 = new Array3();
		arr2.display(nums);
		sc.close();
	}
}
