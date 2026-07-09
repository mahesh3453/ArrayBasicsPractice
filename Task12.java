package com.nit.arrays;

import java.util.Scanner;

/*
1. Linear Search – Find User By ID
Question:
Your system stores a list of user IDs. Given a target ID, 
find the index where the user is stored. If not present, return -1.
Input:
User IDs: [101, 203, 305, 450, 500]
Target ID: 305*/
public class Task12 {
	public static int lenearSearch(int[]nums) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target ID: ");
		int target = sc.nextInt();
		sc.close();
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == target) {
				return i;
			}
		}
	    return -1;
	}
	public static void main(String[] args) {
		int [] nums = {101,203,305,450,500};
		System.out.println(lenearSearch(nums));
	}
}
