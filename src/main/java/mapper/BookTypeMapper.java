package mapper;

import java.util.List;
import pojo.BookType;

public interface BookTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table book_type
	 * @mbg.generated
	 */
	int insert(BookType row);
	int deleteBookType(int bookId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table book_type
	 * @mbg.generated
	 */
	List<BookType> selectAll();
}