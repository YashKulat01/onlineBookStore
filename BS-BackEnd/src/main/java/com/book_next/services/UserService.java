/**
 * 	AURHOR:-> YASH KULAT;
 */
package com.book_next.services;

import java.util.List;

import com.book_next.dtos.UserDTO;
import com.book_next.entities.Role;

/**
 * 	USER SERVICE INTERFACE
 */
public interface UserService {
	UserDTO registerUser(UserDTO userDTO);
	
	List<UserDTO> getAllUsers();
	
	List<UserDTO> getUsersByRole(Role role);
	
	void removeUser(String email);
	
	UserDTO findByEmail(String email);
}
