package com.nit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int [] nums = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Array before Removing duplicates: "+Arrays.toString(nums));
		System.out.print("\nArray after Removing duplicates: "+Arrays.toString(removeDuplicates(nums)));
		sc.close();
	}
	
	public static int [] removeDuplicates(int [] nums) {
		// first sort the array
		for(int i = 0;i<nums.length;i++) {
			int key = nums[i];
			int j = i - 1;
			while(j>=0 && nums[j] > key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
		
		//Then two pointer technique
		int i = 0;
		for(int j = 1;j<nums.length;j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		
		int [] result = new int[i+1];
		
		for(int k = 0;k<i+1;k++) {
			result[k] = nums[k];
		}
		return result;
	}
}
