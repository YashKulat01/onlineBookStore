/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.servicesImpls;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.book_next.dtos.BookDTO;
import com.book_next.entities.Book;
import com.book_next.entities.Category;
import com.book_next.enums.BookCategory;
import com.book_next.exceptions.NotFoundException;
import com.book_next.repositories.BookCategoryRepository;
import com.book_next.repositories.BookRepository;
import com.book_next.services.BookService;
import com.book_next.services.FileService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 * THIS IS BOOK SERVICE IMPL CLASS;
 */

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Autowired
	private ModelMapper modelMapper;

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private FileService fileService;
	
	private final String path = "uploads/books/";
	
//	ADD BOOK SECTION------------------------------------------------------------------------------
	@Override
	public BookDTO addBook(BookDTO bookDTO , MultipartFile image) {

		Book book = modelMapper.map(bookDTO, Book.class);

		Category bookCategory = bookCategoryRepository.findByBookCategory(bookDTO.getBookCategory())
				.orElseThrow(() -> new NotFoundException("Book category not found !!"));
		
		book.setCategory(bookCategory);

		String imgName = fileService.uploadFile(image, path);
		
		book.setBookImage(imgName);
		
		Book savedBook = bookRepository.save(book);

		return modelMapper.map(savedBook, BookDTO.class);
	}
// -----------------------------------------------------------------------------------------------

//	GET BOOKS BY CATEGORY SECTION ----------------------------------------------------------------
	@Override
	public List<BookDTO> getBooksByCategory(BookCategory bookCategory) {

		return bookRepository.findByCategory_BookCategory(bookCategory).stream()
				.map(t -> modelMapper.map(t, BookDTO.class)).toList();
	}
// -----------------------------------------------------------------------------------------------

//	GET ALL BOOKS SECTION ------------------------------------------------------------------------
	@Override
	public List<BookDTO> getAllBooks() {

		return bookRepository.findAll().stream().map(t -> modelMapper.map(t, BookDTO.class)).toList();
	}
// -----------------------------------------------------------------------------------------------

//	DELETE BOOK SECTION --------------------------------------------------------------------------
	@Override
	@Transactional
	public void deleteBook(String bookName) {

		Book removedBook = bookRepository.findByBookTitle(bookName)
				.orElseThrow(() -> new NotFoundException("Book not found !!"));

		bookRepository.delete(removedBook);
	}
// -----------------------------------------------------------------------------------------------

//	GET BOOK BY ID SECTION -----------------------------------------------------------------------
	@Override
	public BookDTO getBookById(int id) {

		Book book = bookRepository.findById(id).orElseThrow(() -> new NotFoundException("Book Not found !!"));
		
		return modelMapper.map(book, BookDTO.class);
	}
// -----------------------------------------------------------------------------------------------

}
