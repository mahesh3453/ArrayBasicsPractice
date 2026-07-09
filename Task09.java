package com.nit.arrays;

import java.util.Arrays;
import java.util.Scanner;

//delete repetitive elements
public class Task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] nums = {10, 20, 30, 40, 30, 20, 50,30, 80};
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println("Entet the element: ");
		int ele = sc.nextInt();
		
		int len = nums.length;
		
		for(int i = 0;i<len;i++) {
			if(ele == nums[i]) {
				for(int j = i;j<nums.length-1;j++) {
					nums[j] = nums[j+1];
				}
				len--;
				i--;
			}
		}
		
		int [] result = new int[len];
		
		for(int i = 0;i<len;i++) {
			result[i] = nums[i];
		}
		
		System.out.println(Arrays.toString(result));
		
		sc.close();
		
	}
}
