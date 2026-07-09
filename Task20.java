package com.nit.arrays;
//Frequency of each element in array
public class Task20 {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,8,5,2,5,4,7,1,2,5,4,7,8,5,7};
		
		for(int i = 0;i< nums.length; i++) {
			int count = 1;
			if(nums[i] == -1) {
				continue;
			}
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					count++;
					nums[j] = -1;
				}
			}
			System.out.println("Frequency of "+nums[i]+" is "+count);
		}
		
	}
}
