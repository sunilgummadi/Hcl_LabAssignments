/**
 * 
 */
package com.service;

/**
 * @author sunil
 *
 */
public class UserMainCode {
	public static int ipValidator(String ipAddress) {
		String[] address = ipAddress.split("\\.");
		if (address.length != 4)
			return 2;
		for (int i = 0; i < 4; i++) {
			int ip = Integer.parseInt(address[i]);
			if (ip < 0 || ip > 255)
				return 2;
		}
		return 1;
	}
}
