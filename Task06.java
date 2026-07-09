package com.nit.arrays;

import java.util.Arrays;

/*Daily Task Rotation in a Team

Team tasks are assigned in the order:
[1,2,3,4,5]
Every 2 days, Lina needs to rotate tasks left by k = 2 so everyone gets a new task.
Expected Output:
[3,4,5,1,2]
*/
public class Task06 {
	public static void main(String[] args) {
		int [] tasks = {1,2,3,4,5,6,7,8};
		
		int temp1 = tasks[0];
		int temp2 = tasks[1];
		
		for(int i = 0; i < tasks.length-2 ;i++) {
			tasks[i] = tasks[i+2];
		}
		
		tasks[tasks.length-1] = temp2;
		tasks[tasks.length-2] = temp1;
		
		System.out.println(Arrays.toString(tasks));
	}
}
