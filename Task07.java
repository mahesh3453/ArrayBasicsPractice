package com.nit.arrays;

import java.util.Arrays;

/*Recently Used Files Order

An application maintains a list of recently used files:
[10,20,30,40]
When the user opens the last file again, it must be moved to the front (right rotate by 1):
Output:
[40,10,20,30]
*/
public class Task07 {
	public static void main(String[] args) {
		int [] files = {10,20,30,40,50,60,70};
		
		int temp = files[files.length-1];
		
		for(int i=files.length-1; i>0 ;i--) {
			files[i] = files[i-1];
		}
		
		files[0] = temp;
		
		System.out.println(Arrays.toString(files));
	}
}
