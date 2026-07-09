package com.nit.arrays;
/*6. Count Duplicate Elements – Login Attempts
Question:
Given login IP logs, count how many distinct IPs appear more than once.
Input:
IP Logs: [101, 202, 303, 202, 101, 101]
Output:
Duplicate IP count: 2
(101 and 202)*/
public class Task17 {
	public static void main(String[] args) {
		int [] ipLogs = {101,202,303,202,101,101};
		boolean [] duplicates = new boolean[ipLogs.length];
		
		int duplicateValues = 0;
		for(int i = 0;i<ipLogs.length;i++) {
			if(duplicates[i]) {
				continue;
			}
			int count = 1;
			for(int j = i+1; j<ipLogs.length;j++) {
				if(ipLogs[i] == ipLogs[j]) {
					count++;
					duplicates[j] = true;
				}
			}
			if(count>1) {
				duplicateValues++;
			}
		}
		System.out.println("Duplicate IP count: "+duplicateValues);
	}
}
