package com.nit.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Q2. Delete-One Operation (Remove First Occurrence of a Token)
=================================================
If a patient leaves the queue without consultation, the hospital removes only the first occurrence of their token.
Question:
Given the tokens:
tokens = {10, 11, 12, 11, 13, 14}
The patient with token 11 leaves.
Write a program to delete only the first occurrence of token 11.
Expected Output:
{10, 12, 11, 13, 14}*/
public class Task11 {
	public static void main(String[] args) {
		int [] tokens = {10,11,12,11,13,14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to delete: ");
		int element = sc.nextInt();
		
		int index = -1;
		// find the given elements index
		for(int i = 0; i<tokens.length;i++) {
			if(element == tokens[i]) {
				index = i;
			}
		}
		
		if(index != -1) {
			int [] result = new int[tokens.length-1];
			
			int resultIndex = 0;
			
			for(int i =0;i<tokens.length;i++) {
				if(i!=index) {
					result[resultIndex++] = tokens[i];
				}
			}
			
			System.out.println("Original Array: "+Arrays.toString(tokens));
			System.out.println("New Array: "+Arrays.toString(result));
		}
		else {
			System.out.println("Element not found");
		}
		
		sc.close();
		
	}
}
