package com.nit.arrays;

import java.util.Arrays;

/*
Display Order History from Newest to Oldest
An app stores user order amounts in chronological order:
int[] orders = {5,10,15,20};
When the user views their order history, Bob must show it in reverse order (newest first):
Expected Output:
{20,15,10,5}
*/
public class Task04 {
	public static void main(String[] args) {
		int [] orders = {5,10,15,20};
		
		int [] result = new int[orders.length];
		
		int index = 0;
		
		for(int i = orders.length - 1;i >= 0;i--) {
			result[index] = orders[i];
			index++;
		}
		
		System.out.println(Arrays.toString(result));
	}
}
