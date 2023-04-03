package com.codingdojo.com.BooksAPI.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.com.BooksAPI.models.Book;
import com.codingdojo.com.BooksAPI.services.BookService;

@RestController // Responds with raw data (JSON / String literals) Controller will return a jsp page
public class BooksAPI {
 private final BookService bookService;
 public BooksAPI(BookService bookService){
     this.bookService = bookService;
 }
 @RequestMapping("/api/books")
 public List<Book> index() {
     return bookService.allBooks();
 }
 
 @RequestMapping(value="/api/books", method=RequestMethod.POST)
 public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
     Book book = new Book(title, desc, lang, numOfPages);
     return bookService.createBook(book);
 }
 
 @RequestMapping("/api/books/{id}")
 public Book show(@PathVariable("id") Long id) {
     Book book = bookService.findBook(id);
     return book;
 }

 @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
 public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	 
	 Book updatedBook = bookService.findBook(id);
	 
	 // calling a method from you Book class
	 updatedBook.setTitle(title);
	 updatedBook.setDescription(desc);
	 updatedBook.setLanguage(lang);
	 updatedBook.setNumberOfPages(numOfPages);

	 Book book = bookService.updateBook(updatedBook);
	 return book;
 }
 
 
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id); 
 }
}