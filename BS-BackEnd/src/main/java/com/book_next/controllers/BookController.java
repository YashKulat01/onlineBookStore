/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book_next.dtos.BookDTO;
import com.book_next.enums.BookCategory;
import com.book_next.services.BookService;

/**
 *  THIS IS BOOK CONTROLLER CLASS;
 */

@RestController
@RequestMapping("/book")

public class BookController {

	@Autowired
	private BookService bookService;
	
	
//	ADD BOOK SECTION --------------------------------------------------------------
	@PostMapping("/add_book")
	public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO bookDTO){
		
		return ResponseEntity.ok(bookService.addBook(bookDTO));
	}
//	-------------------------------------------------------------------------------
	
	
//	GET BOOKS BY CATEGORY SECTION -------------------------------------------------
	@GetMapping("/get_book/{catg}")
	public ResponseEntity<List<BookDTO>> getBookByCategory(@PathVariable BookCategory catg) {				
		
		return ResponseEntity.ok(bookService.getBooksByCategory(catg));
	}
//	-------------------------------------------------------------------------------

	
//	GET ALL FOOD SECTION ----------------------------------------------------------
	@GetMapping("/get_books")
	public ResponseEntity<List<BookDTO>> getAllBooks() {
		
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
//	-------------------------------------------------------------------------------

	
//	 DELETE BOOK SECTION ----------------------------------------------------------
	@DeleteMapping("/del_book/{name}")
	public ResponseEntity<Map<String, String>> deleteBook(@PathVariable String name){
		
		bookService.deleteBook(name);
		
		HashMap<String, String> msg = new HashMap<String, String>();
		
		msg.put("Message: ", "Book deleted!");
		
		return ResponseEntity.ok(msg);
	}
//	-------------------------------------------------------------------------------

}
