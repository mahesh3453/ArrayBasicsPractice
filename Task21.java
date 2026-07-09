package com.nit.arrays;

public class Task21 {
	public static void main(String[] args) {
		//int [] nums = {1,2,3,4,8,5,2,5,4,7,1,2,5,4,7,8,5,7};
		
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		
		boolean sorted = true;
		for(int i = 0;i<nums.length-1;i++) {
			if(nums[i]>nums[i+1]) {
				sorted = false;
				break;
			}
		}
		
		if(!sorted) {
			System.out.println("Array is not sorted");
		}else {
			System.out.println("Array is sorted");
		}
	}
}
