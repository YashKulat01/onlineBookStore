/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * THIS IS CART ITEMS ENTITY CLASS; 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class CartItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JsonBackReference
	private Cart cart;
	
	@ManyToOne
	private Book book;
	
	private Integer quantity;
	
	private Double price;
}
