package com.nit.arrays;

/*
 * Find the length of last word in a String
 * */
public class Task19 {
	public static void main(String[] args) {
		String str = "Java is very easy  ";
		int count = 0;
		for(int i = str.length()-1;i>=0;i--) {
			if(str.charAt(i) != ' ') {
				count++;
			}else if(str.charAt(i) == ' ' && count != 0) {
				break;
			}
		}
		
		System.out.println("Length of last word in String is "+count);
	}
}
