package com.nit.arrays;
//find the second max value in array

import java.util.Arrays;

public class Task18 {
	// Bubble sort method
	public static void main(String[] args) {
	    int [] nums = {1,5,2,4,3,7,6};
			
		for(int i = 0;i<nums.length-1;i++) {
			for(int j = 0;j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array : "+Arrays.toString(nums));
			
		// now find the second max number
			
		int max = nums[nums.length - 1];
		int secondMax = 0;
		boolean isFound = false;
		for(int i = nums.length-1; i >= 0 ; i--) {
			if(nums[i]<max) {
				secondMax = nums[i];
				isFound = true;
				break;
			}
		}
			
			if(isFound) {
				System.out.println("Second max number is : "+secondMax);
			}else {
				System.out.println("All elements are equal");
			}
	}
}
