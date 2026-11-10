/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.services;

import java.util.List;

import com.book_next.dtos.BookDTO;
import com.book_next.enums.BookCategory;

/**
 * 	BOOK SERVICE INTERFACE
 */
public interface BookService {
	BookDTO addBook(BookDTO bookDTO);
	
	List<BookDTO> getBooksByCategory(BookCategory bookCategory);
	
	List<BookDTO> getAllBooks();
	
	void deleteBook(String bookName);
}
