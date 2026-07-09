package com.nit.arrays;

import java.util.Arrays;
// Bubble sort method
public class BubbleSort {
	public static void main(String[] args) {
		int [] nums = {1,5,2,4,3,2,6};
		
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array : "+Arrays.toString(nums));
	}
}
