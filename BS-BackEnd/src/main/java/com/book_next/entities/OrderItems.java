/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	THIS IS ORDER ITEMS CLASS ENTITY;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer quantity;
	private Double price;
	private String bookName;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	@JsonManagedReference
	private Order order;
}
