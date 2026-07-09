package com.nit.arrays;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int [] nums = {800,100,500,300,200,900,700,600};
		
		for(int i = 1;i<nums.length;i++) {
			int key = nums[i];
			int j = i-1;
			
			while(j >= 0 && nums[j]>key) {
				nums[j+1] = nums[j];
				j--;
			}
			
			nums[j+1] = key;
		}
		System.out.println(Arrays.toString(nums));
	}
}
