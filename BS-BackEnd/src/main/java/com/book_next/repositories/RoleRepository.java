/**
 *  AUTHOR:-> YASH KULAT
 */
package com.book_next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_next.entities.Role;
import java.util.Optional;

import com.book_next.enums.AppRole;


/**
 * 	ROLE REPOSITORY INTERFACE
 */
public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Optional<Role> findByRoleName(AppRole roleName);
}
