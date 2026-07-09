package com.nit.arrays;

import java.util.Arrays;

/*
5. Count Even & Odd – Visitor Analytics
Question:
Given daily visitor counts, count how many days had even visitors and how many had odd.
Input:
Visitors per day: [120, 133, 150, 177, 200]
Output:
Even count: 3
Odd count: 2
*/
public class Task16 {
	public static void main(String[] args) {
		int [] visitors = {120,133,150,177,200};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 0;i<visitors.length;i++) {
			if(visitors[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println("Visitors per day: "+Arrays.toString(visitors));
		System.out.println("Even count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
	}
}
