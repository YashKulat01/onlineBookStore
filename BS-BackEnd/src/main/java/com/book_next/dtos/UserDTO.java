/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.dtos;

import com.book_next.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	THIS IS DATA TRANSFER OBJECT OF THE USER ENTITY CLASS;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String phoneNo;
	private Role role;
}
