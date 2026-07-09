package com.nit.arrays;
//Find missing Element in Array
public class Task22 {
	public static void main(String[] args) {
		int [] nums = {1,3,4,5,6};
		int n = nums.length +1;
		//this is ^ approach
		/*int x1 = 0;
		int x2 = 0;
		for(int i=0;i<n-1;i++) {
			x1 = x1^nums[i];
		}
		for(int i = 1;i<=n;i++) {
			x2 = x2^i;
		}
		System.out.println(x1^x2);*/
		
		
		//this is n*(n+1)/2 approach
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		for(int num:nums) {
			actualSum+=num;
		}
		int missingEle = expectedSum - actualSum;
		System.out.println(missingEle);
		
		
	}
}
