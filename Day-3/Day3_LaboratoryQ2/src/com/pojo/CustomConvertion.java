package com.pojo;

public class CustomConvertion {
	public static String convertDtoH(String string) {
		char[] chararray = string.toCharArray();
		for(int i=0;i<chararray.length;i++) {
			if(chararray[i] =='d')
				chararray[i]='h';
		}
		String newString = new String(chararray);
		return newString;
	}
}
