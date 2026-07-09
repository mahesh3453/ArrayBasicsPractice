package com.nit.arrays;

import java.util.Arrays;

/*
Weekly Duty Roaster Rotation
A duty roaster is maintained like this:
[1,2,3,4,5]
After 3 weeks (k = 3), duties rotate to the right so new people move forward in priority.

Expected Output:
[3,4,5,1,2]
*/
public class Task08 {
	public static void main(String[] args) {
		int [] dutyRoaster = {1,2,3,4,5};
		
		int temp1 = dutyRoaster[0];
		int temp2 = dutyRoaster[1];
		
		for(int i = 0; i < dutyRoaster.length-2 ;i++) {
			dutyRoaster[i] = dutyRoaster[i+2];
		}
		
		dutyRoaster[dutyRoaster.length-1] = temp2;
		dutyRoaster[dutyRoaster.length-2] = temp1;
		
		System.out.println(Arrays.toString(dutyRoaster));
	}
}
