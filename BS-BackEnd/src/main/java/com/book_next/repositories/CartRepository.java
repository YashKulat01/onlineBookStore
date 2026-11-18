/**
 *  AUTHOR:-> YASH KULAT;
 */
package com.book_next.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_next.entities.Cart;

/**
 * 	THIS IS REPOSITORY INTERFACE OF CART ENTITY;
 */

public interface CartRepository extends JpaRepository<Cart, Integer>{
	Optional<Cart> findByUserId(Integer userId);
}
