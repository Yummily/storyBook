package service;

import java.util.List;

import pojo.Book;
import pojo.Chapter;

public interface bookService {
	public List<Book> selectAllBook();
	public Book insertBook(Book book);
	public Book updateBook(Book book);
	public int deleteBook(int bookId);
	public Book showBook(int bookId);
	public Book readBook(int bookId);
	public int writeBook(Chapter  chapter);
	public int deleteChapter(int chapterId);
}
