package com.nit.arrays;

public class BinarySearch {
	
	public static int binarySearch(int [] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] nums = {1,3,9,14,21,25,27,29,31};
		int result = binarySearch(nums, 31);
		if(result != -1) {
			System.out.println(result);
		}
		else {
			System.err.println("Element not found");
		}
	}
}
