package com.nit.arrays;

import java.util.Scanner;

/*2. First & Last Occurrence – Transaction Time Range
Question:
A payment history stores transaction amounts. Find the first and last index where a specific amount occurs.
Input:
Transaction Amounts: [200, 500, 500, 500, 900, 1200]
Target Amount: 500
Output:
First occurrence index: 1
Last occurrence index: 3
*/

public class Task13 {
	public static void main(String[] args) {
		int [] amounts = {200,500,500,500,900,1200,1200,500};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target amount: ");
		int target = sc.nextInt();
		
		int firstOccurrence = 0;
		int lastOccurrence = 0;
		for(int i = 0;i<amounts.length;i++) {
			if(amounts[i] == target) {
				firstOccurrence = i;
				break;
			}
		}
		
		for(int i = 0; i<amounts.length;i++) {
			if(amounts[i] == target) {
				lastOccurrence = i;
			}
		}
		
		System.out.println("First occurrence index: "+firstOccurrence);
		System.out.println("Last occurrence index: "+lastOccurrence);
		sc.close();
	}

}
