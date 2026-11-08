/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_next.entities.Category;
import java.util.Optional;

import com.book_next.enums.BookCategory;


/**
 *  THIS IS BOOK REPOSITORY INTERFACE.
 */
public interface BookCategoryRepository extends JpaRepository<Category, Integer>{
	
	Optional<Category> findByBookCategory(BookCategory bookCategory);
}
