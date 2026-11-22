/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.book_next.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	THIS IS DATA TRANSFER OBJECT OF ORDER ENTITY;
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
		
	private Integer id;
	private Integer userId;
	private Double totalAmount;
	private OrderStatus orderStatus;
	private LocalDateTime orderDate;
	private List<OrderItemsDTO> orderItems;
}
