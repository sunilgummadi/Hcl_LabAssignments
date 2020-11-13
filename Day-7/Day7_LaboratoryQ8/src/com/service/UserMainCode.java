/**
 * 
 */
package com.service;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author sunil
 *
 */
public class UserMainCode {
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		ArrayList<Integer> requiredList = new ArrayList<Integer>();
		array1.addAll(array2);
		Collections.sort(array1);
		requiredList.add(array1.get(2));
		requiredList.add(array1.get(6));
		requiredList.add(array1.get(8));
		return requiredList;
	}
}
