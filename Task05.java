package com.nit.arrays;

import java.util.Arrays;

/*
Rotating Playlist – Next Song Feature
A music app stores the playlist as:
[10,20,30,40,50]
When the user presses Next, the playlist rotates left by 1:
Output:
[20,30,40,50,10]
*/
public class Task05 {
	public static void main(String[] args) {
		int [] playList = {10,20,30,40,50};
		
		int temp = playList[0];
		
		for(int i = 0;i<playList.length-1;i++) {
			playList[i] = playList[i+1];
		}
		
		playList[playList.length-1] = temp;
		
		System.out.println(Arrays.toString(playList));
	}
}
