package pojo;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table book_type
 */
public class BookType {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book_type.book_id
	 * @mbg.generated
	 */
	private Integer bookId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book_type.type_id
	 * @mbg.generated
	 */
	private Integer typeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book_type.book_id
	 * @return  the value of book_type.book_id
	 * @mbg.generated
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book_type.book_id
	 * @param bookId  the value for book_type.book_id
	 * @mbg.generated
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book_type.type_id
	 * @return  the value of book_type.type_id
	 * @mbg.generated
	 */
	public Integer getTypeId() {
		return typeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book_type.type_id
	 * @param typeId  the value for book_type.type_id
	 * @mbg.generated
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
}