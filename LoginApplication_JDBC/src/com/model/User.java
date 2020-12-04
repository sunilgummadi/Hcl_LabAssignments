/**
 * 
 */
package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunil
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int userId;
	private String userName;
	private String password;
}
