/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.dtos;

import com.book_next.enums.BookCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 	THIS IS DATA TRANSFER OBJECT OF BOOK ENTITY.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {
	
	private Integer bookId;
	private String bookTitle;	
	private String bookAuthor;	
	private String bookPublisher;	
	private BookCategory bookCategory;	
	private String bookIsbn;	
	private String bookDescription;	
	private String bookImage;	
	private Double bookPrice;
}
