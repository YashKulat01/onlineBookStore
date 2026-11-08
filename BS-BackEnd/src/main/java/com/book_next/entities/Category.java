/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.entities;

import com.book_next.enums.BookCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  THIS IS BOOK CATEGORY ENTITY.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer C_id;
	
	@Enumerated(EnumType.STRING)
	@Column(unique = true, nullable = false)
	private BookCategory bookCategory;
	
	
}
