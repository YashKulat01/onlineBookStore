/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.services;

import java.util.List;

import com.book_next.dtos.CartDTO;

/**
 * 	THIS IS BOOK SERVICE INTERFACE OF CART ENTITY;
 */
public interface CartService {
	
	CartDTO addToCart(Integer userId, Integer bookId, Integer quantity);
	
	CartDTO getCartByUserI(Integer userId);
	
	CartDTO removeFromCart(Integer userId, Integer bookId);
	
	void clearCart(Integer userId);
	
	List<CartDTO> getAllCarts();
	
	void deleteCart(Integer cartId);
}
