/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.dtos;

import java.util.List;

import com.book_next.entities.CartItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	THIS IS DATA TRANSFER OBJECT OF CART ENTITY;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CartDTO {
	
	private Long cartId;
	private Long userId;
	private List<CartItems> items;
	private Double totalPrice;
}
