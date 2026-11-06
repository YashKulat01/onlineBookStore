/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.servicesImpls;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.book_next.dtos.UserDTO;
import com.book_next.entities.Role;
import com.book_next.entities.User;
import com.book_next.enums.AppRole;
import com.book_next.exceptions.NotFoundException;
import com.book_next.repositories.RoleRepository;
import com.book_next.repositories.UserRepository;
import com.book_next.services.UserService;

/**
 * THIS IS USER SERVICE IMPLEMENTATION CLASS
 */
public class UserServiceImpls implements UserService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

//	REGISTER USER SECTION---------------------------------------------------------------------
	@Override
	public UserDTO registerUser(UserDTO userDTO) {
		// TODO Auto-generated method stub

		User user = modelMapper.map(userDTO, User.class);

		Role role = roleRepository.findByRoleName(AppRole.ROLE_USER)
				.orElseThrow(() -> new NotFoundException("Role Not Found !!"));
		
		user.setRole(role);
		
		User savedUser = userRepository.save(user);
		
		return modelMapper.map(savedUser, UserDTO.class);
	}
//	------------------------------------------------------------------------------------------

//	GET ALL USERS SECTIONS--------------------------------------------------------------------
	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll().stream().map(t -> modelMapper.map(t, UserDTO.class)).toList();
	}
//	------------------------------------------------------------------------------------------

	@Override
	public List<UserDTO> getUsersByRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDTO findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
