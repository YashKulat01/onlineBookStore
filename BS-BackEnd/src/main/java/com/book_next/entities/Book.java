/**
 * 	AUTHOR:-> YASH KULAT;
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
 * 	THIS IS BOOK ENTITY CLASS
 */

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	
	@Column(nullable = false, unique = true)
	private String bookTitle;
	
	@Column(nullable = false)
	private String bookAuthor;
	
	@Column(nullable = false)
	private String bookPublisher;
		
	@Column(nullable = false, unique = true)
	private String bookIsbn;
	
	@Column(nullable = false)
	private String bookDescription;
	
	private String bookImage;
	
	@Column(nullable = false)
	private Double bookPrice;
	
	@Column(nullable = false)
	private boolean deleted = false;
	
	@ManyToOne
	@JsonManagedReference
	private Category category;
}
