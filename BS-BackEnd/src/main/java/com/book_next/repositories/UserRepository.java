/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_next.entities.User;
import java.util.Optional;
import java.util.List;
import com.book_next.entities.Role;

/**
 * 	THIS IS REPOSITORY OF USER ENTITY;
 */
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);
	
	List<User> getUserByRole(Role role);
}
