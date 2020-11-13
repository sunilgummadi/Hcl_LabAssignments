/**
 * 
 */
package com.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunil
 *
 */
public class UserMainCode {
	public static String[] obtainDesignation(HashMap<String,String> details,String designation) {
		String[] resultStrings = new String[details.size()];
		int i=0;
		for(Map.Entry<String, String> each:details.entrySet()) {
			if(each.getValue().equals(designation)) {
				resultStrings[i++]=each.getKey();
			}
		}
		return resultStrings;
	}
}
