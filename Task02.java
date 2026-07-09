package com.nit.arrays;

import java.util.Arrays;

/*
 Generating Combined Seating from Two Rows

Two rows in a classroom have student roll numbers:

rowA = {10,20,30}
rowB = {40,50,60}

The teacher asks John to prepare a zig-zag seating plan like:

First from row A
Then row B
Then A
Then B, and so on…

Expected Output:
{10,40,20,50,30,60}
*/
public class Task02 {
	public static void main(String[] args) {
		int [] rowA = {10,20,30};
		int [] rowB = {40,50,60};
		
		int [] result = new int[rowA.length + rowB.length];
		
		int index = 0;
		int max= rowA.length>=rowB.length? rowA.length:rowB.length;
		
			for (int i = 0; i <max;i++) {
				if(i<rowA.length) {
				result[index] = rowA[i];
				index++;
				}
				
				if(i<rowB.length) {
				result[index] = rowB[i];
				index++;		
				}
			}
		
		System.out.println(Arrays.toString(result));
	}
}
