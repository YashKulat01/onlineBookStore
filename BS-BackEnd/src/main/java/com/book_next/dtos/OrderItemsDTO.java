/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  THIS IS DATA TRANSFER OBJECT OF ORDER ITEMS ENTITY;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItemsDTO {
	
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	private Integer quantity;
	
	public Double getTotalItemPrice() {
		return bookPrice * quantity;
	}
}
