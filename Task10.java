package com.nit.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Q1. Insert Operation (Insert New Patient Token at Index)
=================================================
A hospital OPD stores patient token numbers in an integer array.

Question:
You are given an array of patient token numbers:
tokens = {5, 6, 6, 8, 9, 5, 5}

A new patient with token 7 arrives, and their token must be inserted at index 3.
Write a program to insert the token at the given index and shift the remaining elements to the right.

Expected Output:
{5, 6, 6, 7, 8, 9, 5, 5}
*/
public class Task10 {
	public static void main(String[] args) {
		int [] tokens = {5,6,6,7,8,9,5,5};
		System.out.println(Arrays.toString(tokens));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the index: ");
		int index = sc.nextInt();
		
		System.out.println("Enter the element");
		int element = sc.nextInt();
		
		if(index < 0 || index > tokens.length) {
			System.out.println("Index not found!!");
		}
		else {
			int [] result = new int[tokens.length+1];
			
			for(int i = 0; i<tokens.length;i++) {
				result[i] = tokens[i];
			}
			
			for(int i = result.length-1;i>index;i--) {
				result[i] = result[i-1];
			}
			
			result[index] = element;
			
			System.out.println(Arrays.toString(result));
		}
		sc.close();
	}
}
