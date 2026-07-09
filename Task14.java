package com.nit.arrays;

import java.util.Arrays;

/*3. Swap Adjacent Elements – Seat Arrangement
Question:
A seat list has been accidentally swapped in pairs. Fix the order by swapping every adjacent pair.
Input:
Seats: [A1, A2, B1, B2]
Output:
Corrected Seats: [A2, A1, B2, B1]*/
public class Task14 {
	public static void main(String[] args) {
		
		String [] seats = {"A1","A2","B1","B2"};
		
		System.out.println("Original Seats: "+Arrays.toString(seats));
		
		for(int i = 0; i<seats.length -1;i+=2) {
			String temp = seats[i];// storing the first element in temp variable
			seats[i] = seats[i+1];// put the next element in first elements place
			seats[i+1] = temp;// update the next variable to first element means temp
		}
	
		System.out.println("Corrected Seats: "+Arrays.toString(seats));
	}
}
