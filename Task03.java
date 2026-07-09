package com.nit.arrays;

import java.util.Arrays;

/*
 Backup List of Employee IDs
HR gives Bob an array of employee IDs:
int[] empIds = {10, 20, 30, 40};
He must create a backup copy of this array into another array.
*/
public class Task03 {
	public static void main(String[] args) {
		int [] empIds = {10,20,30,40};
		
		int [] result = new int[empIds.length];
		
		for(int i = 0;i<empIds.length;i++) {
			result[i] = empIds[i];
		}
		
		System.out.println(Arrays.toString(result));
	}
}
