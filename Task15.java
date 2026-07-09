package com.nit.arrays;

import java.util.Arrays;

/*Move Zeroes to End – Inventory Management
Question:
In an inventory array, zero means "no stock." Move all zeroes to the end without changing order of other items.
Input:
Stock Array: [5, 0, 8, 0, 12, 7]
Output:
Updated Array: [5, 8, 12, 7, 0, 0]*/
public class Task15 {
	public static void main(String[] args) {
		int [] stock = {5,0,8,0,12,7};
		
		System.out.println("Stock Array: "+Arrays.toString(stock));
		
		int [] updatedStock = new int[stock.length];
		int index = 0;
		for(int i = 0; i< stock.length;i++) {
			if(stock[i] != 0) {
				updatedStock[index++] = stock[i];
			}
		}
		
		System.out.println("Updated Array: "+Arrays.toString(updatedStock));
	}
}
