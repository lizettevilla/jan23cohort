package com.codingdojo.com.BookClub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.BookClub.models.Book;
import com.codingdojo.com.BookClub.repositories.BookRepo;

@Service
public class BookServ {

	@Autowired
	private BookRepo bookRepo;
	
	
//	======
//	CREATE
//	======
	public Book savePup(Book b) {
		return bookRepo.save(b);
	}
	
//	====
//	READ
//	====
	public List<Book> getAll() {
		return bookRepo.findAll();
	}
	public Book getOne(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
//	======
//	UPDATE
//	======
	public Book updateOne(Book editBook) {
		return bookRepo.save(editBook);
	}
	
//	======
//	DELETE
//	======
	public void deleteOne(Long id) {
		bookRepo.deleteById(id);
	}
}