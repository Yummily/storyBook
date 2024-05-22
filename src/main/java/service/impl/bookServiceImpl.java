package service.impl;

import java.util.List;

import mapper.BookMapper;
import mapper.BookTypeMapper;
import pojo.Book;
import pojo.BookType;
import pojo.Type;
import service.bookService;
import util.baseSqlSession;

public class bookServiceImpl implements bookService{
	BookMapper bookMapper = baseSqlSession.getSqlSession().getMapper(BookMapper.class);
	BookTypeMapper bookTypeMapper = baseSqlSession.getSqlSession().getMapper(BookTypeMapper.class);
	@Override
	public List<Book> selectAllBook() {
		
		List<Book> bookList = bookMapper.selectAll();
		return bookList;
	}
	@Override
	public Book insertBook(Book book) {
		bookMapper.insert(book);
		int id = book.getBookId();
		BookType bookType =  new BookType();
		bookType.setBookId(book.getBookId());
		for (Type type : book.getTypeList()) {
			bookType.setTypeId(type.getTypeId());
			bookTypeMapper.insert(bookType);
		}
		return bookMapper.selectBookAndType(id);
	}
	@Override
	public Book updateBook(Book book) {
		bookMapper.updateByPrimaryKey(book);
		bookTypeMapper.deleteBookType(book.getBookId());
		BookType bookType =  new BookType();
		bookType.setBookId(book.getBookId());
		for (Type type : book.getTypeList()) {
			bookType.setTypeId(type.getTypeId());
			bookTypeMapper.insert(bookType);
		}
		return bookMapper.selectBookAndType(book.getBookId());
	}
	@Override
	public int deleteBook(int bookId) {
		bookTypeMapper.deleteBookType(bookId);
		int i = bookMapper.deleteByPrimaryKey(bookId);
		return i;
	}
	@Override
	public Book showBook(int bookId) {
		// TODO Auto-generated method stub
		return bookMapper.selectBookAndType(bookId);
	}
	@Override
	public Book readBook(int bookId) {
		// TODO Auto-generated method stub
		
		return bookMapper.selectBookAndChapter(bookId);
	}

}
