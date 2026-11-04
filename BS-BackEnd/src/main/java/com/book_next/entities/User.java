/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * THIS IS USER ENTITY CLASS OF THE PROJECT.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 40, nullable = false) //
	private String name;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(length = 10, nullable = false)
	private String phoneNo;
	
	@ManyToOne
	@JsonManagedReference
	private Role role;
	
}
