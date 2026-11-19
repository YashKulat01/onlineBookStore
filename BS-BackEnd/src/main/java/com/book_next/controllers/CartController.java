/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book_next.dtos.CartDTO;
import com.book_next.services.CartService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * THIS IS CART CONTROLLER CLASS OF CART ENTITY;
 */

@RestController
@RequestMapping("/cart")

public class CartController {

	@Autowired
	private CartService cartService;

	@PostMapping("/add_cart")
	public ResponseEntity<CartDTO> addToCart(@RequestParam Integer userId, @RequestParam Integer bookId,
			@RequestParam Integer quantity) {
		
		CartDTO newCart = cartService.addToCart(userId, bookId, quantity);
		
		return new ResponseEntity<CartDTO>(newCart, HttpStatus.CREATED);
	}
	
	@GetMapping("/get_cart/{user_id}")
	public ResponseEntity<CartDTO> getCart(@PathVariable Integer user_id) {
		
		return ResponseEntity.ok(cartService.getCartByUserId(user_id));
	}
	
	@GetMapping("/all_carts")
	public ResponseEntity<List<CartDTO>> getAllCarts(){
		
		return ResponseEntity.ok(cartService.getAllCarts());
	}
	
	@DeleteMapping("/remove_item")
	public ResponseEntity<CartDTO> removeFromCart(@RequestParam Integer userId, @RequestParam Integer bookId){
		
		return ResponseEntity.ok(cartService.removeFromCart(userId, bookId));
	}
	
	@DeleteMapping("clr_cart/{id}")
	public ResponseEntity<Map<String, String>> clearCart(@PathVariable Integer id){
		
		cartService.clearCart(id);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Message: ", "Cart cleared !");
		
		return ResponseEntity.ok(map);
	}
	
	@DeleteMapping("/del_cart/{id}")
	public ResponseEntity<Map<String, String>> deleteCart(@PathVariable Integer id){
		cartService.deleteCart(id);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Message: ", "Cart deleted !!");
		
		return ResponseEntity.ok(map);
	}
	
}
