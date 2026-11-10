/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_next.entities.Book;
import com.book_next.enums.BookCategory;

import java.util.List;
import java.util.Optional;


/**
 * 	THIS IS REPOSITORY INTERFACE OF BOOK ENTITY.
 */

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByCategory_BookCategory(BookCategory bookCategory);
	
	Optional<Book> findByBookTitle(String bookTitle);
	
	List<Book> findByDeletedFalse();
}
