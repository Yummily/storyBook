package mapper;

import java.util.List;
import pojo.UserBook;

public interface UserBookMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_book
	 * @mbg.generated
	 */
	int insert(UserBook row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_book
	 * @mbg.generated
	 */
	List<UserBook> selectAll();
}