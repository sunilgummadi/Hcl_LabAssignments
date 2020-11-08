package com.pojo;

public class SearchArray {
	public static int search(int[] array,int searchElement) {
		for(int i=0;i<array.length;i++) {
			if(array[i] == searchElement) {
				return i;
			}
		}
		return -1;
	}
}
