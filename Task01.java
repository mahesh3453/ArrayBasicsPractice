package com.nit.arrays;

import java.util.Arrays;

/*
 Merging Two Branch Sales Lists

A retail company stores the number of sales from two branches as separate arrays:
int[] branch1 = {10,20,30};
int[] branch2 = {40,50};

Management asks Amar to prepare a single combined report containing the sales from both branches.
Output expected:
{10,20,30,40,50}
*/
public class Task01 {
	public static void main(String[] args) {
		int [] branch1 = {10,20,30};
		int [] branch2 = {40,50};
		
		int [] result = new int[branch1.length + branch2.length];
		
		int index = 0;
		
		for (int i : branch1) {
			result[index] = i;
			index++;
		}
		
		for (int i : branch2) {
			result[index] = i;
			index++;
		}
		
		System.out.println(Arrays.toString(result));
	}
}
