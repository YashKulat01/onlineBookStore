/**
 * 	AUTHOR:-> YASH KULAT;
 */
package com.book_next.servicesImpls;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book_next.dtos.CartDTO;
import com.book_next.entities.Book;
import com.book_next.entities.Cart;
import com.book_next.entities.CartItems;
import com.book_next.entities.User;
import com.book_next.exceptions.NotFoundException;
import com.book_next.repositories.BookRepository;
import com.book_next.repositories.CartRepository;
import com.book_next.repositories.UserRepository;
import com.book_next.services.CartService;

/**
 * THIS IS CART SERVICE IMPLEMENTATION CLASS OF CARTSERVICE INTERFACE;
 */

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CartDTO addToCart(Integer userId, Integer bookId, Integer quantity) {

		User user = userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found !"));

		Book book = bookRepository.findById(bookId).orElseThrow(() -> new NotFoundException("Book not found !"));

		Cart cart = cartRepository.findByUserId(userId).orElseGet(() -> {
			Cart newCart = new Cart();
			newCart.setUser(user);
			return newCart;
		});

		Optional<CartItems> presentItem = cart.getItems().stream().filter(t -> t.getBook().getBookId().equals(bookId))
				.findFirst();

		if (presentItem.isPresent()) {
			
			CartItems items = presentItem.get();
			items.setQuantity(items.getQuantity() + quantity);
			items.setPrice(items.getQuantity() * book.getBookPrice());
		} else {

			CartItems items = new CartItems();
			items.setCart(cart);
			items.setBook(book);
			items.setQuantity(quantity);
			items.setPrice(quantity * book.getBookPrice());
			
			cart.getItems().add(items);
		}

		cart.setTotalPrice(cart.getItems().stream().mapToDouble(CartItems::getPrice).sum());
		
		Cart savedCart = cartRepository.save(cart);
		
		return modelMapper.map(savedCart, CartDTO.class);
	}

	@Override
	public CartDTO getCartByUserI(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartDTO removeFromCart(Integer userId, Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearCart(Integer userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CartDTO> getAllCarts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCart(Integer cartId) {
		// TODO Auto-generated method stub

	}

}
