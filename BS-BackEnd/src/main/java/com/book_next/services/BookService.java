/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.book_next.dtos.BookDTO;
import com.book_next.enums.BookCategory;

/**
 * 	BOOK SERVICE INTERFACE
 */
public interface BookService {
	BookDTO addBook(BookDTO bookDTO, MultipartFile image);
	
	List<BookDTO> getBooksByCategory(BookCategory bookCategory);
	
	List<BookDTO> getAllBooks();
	
	BookDTO getBookById(int id);
	
	void deleteBook(String bookName);
}
