package com.pojo;

public class CustomModify {
	public static String getString(String string) {
		StringBuffer stringBuffer = new StringBuffer(string);
		if (string.contains("k")) {
			stringBuffer.replace(1, 2, "");
			return new String(stringBuffer);
		} else if (string.contains("b")) {
			stringBuffer.replace(0, 1, "");
			return new String(stringBuffer);
		} else
			return new String(stringBuffer.replace(0, 2, ""));
	}
}
