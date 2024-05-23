package controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Book;
import pojo.Chapter;
import service.impl.bookServiceImpl;
import util.baseSqlSession;

@RestController
@RequestMapping("/book")
public class bookController {
	bookServiceImpl bookServiceImpl;
	@GetMapping("/bookList")
	public List<Book> bookList() {
		bookServiceImpl = new bookServiceImpl();
		List<Book> books = bookServiceImpl.selectAllBook(); 
		baseSqlSession.closeSqlSession();
		return books;
	}
	
	@PostMapping("/insertBook")
	public Book insertBook(@RequestBody Book book) {
		bookServiceImpl = new bookServiceImpl();
		Book b = bookServiceImpl.insertBook(book);
		baseSqlSession.commitSqlsession();
		baseSqlSession.closeSqlSession();
		return b;
	}
	
	@PostMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		bookServiceImpl = new bookServiceImpl();
		Book b = bookServiceImpl.updateBook(book);
		baseSqlSession.commitSqlsession();
		baseSqlSession.closeSqlSession();
		return b;
	}
	
	@GetMapping("/deleteBook")
	public int deleteBook(int bookId) {
		bookServiceImpl = new bookServiceImpl();
		int i = bookServiceImpl.deleteBook(bookId);
		baseSqlSession.commitSqlsession();
		baseSqlSession.closeSqlSession();
		return i;
	}
	
	@GetMapping("/showBook")
	public Book showBook(int bookId) {
		bookServiceImpl = new bookServiceImpl();
		Book book = bookServiceImpl.showBook(bookId);
		baseSqlSession.closeSqlSession();
		return book;
	}

	@GetMapping("/readBook")
	public Book readBook(int bookId) {
		bookServiceImpl = new bookServiceImpl();
		Book book = bookServiceImpl.readBook(bookId);
		baseSqlSession.closeSqlSession();
		return book;
	}
	
	@PostMapping("/writeBook")
	public int readBook(@RequestBody Chapter chapter) {
		System.out.println(chapter.getChapterContent());
		bookServiceImpl = new bookServiceImpl();
		int i = bookServiceImpl.writeBook(chapter);
		baseSqlSession.commitSqlsession();
		baseSqlSession.closeSqlSession();
		return i;
	}
	
	@GetMapping("/deleteChapter")
	public int deleteChapter(int chapterId) {
		bookServiceImpl = new bookServiceImpl(); 
		int i = bookServiceImpl.deleteChapter(chapterId);
		baseSqlSession.commitSqlsession();
		baseSqlSession.closeSqlSession();
		return i;
	}
	
	
	
}
