package pojo;

import java.util.List;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user
 */
public class User {
	private List<Book> bookList;
	

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	/**
	 * Database Column Remarks: �û�id This field was generated by MyBatis Generator. This field corresponds to the database column user.user_id
	 * @mbg.generated
	 */
	private Integer userId;
	/**
	 * Database Column Remarks: �û��� This field was generated by MyBatis Generator. This field corresponds to the database column user.user_name
	 * @mbg.generated
	 */
	private String userName;
	/**
	 * Database Column Remarks: �û����� This field was generated by MyBatis Generator. This field corresponds to the database column user.user_password
	 * @mbg.generated
	 */
	private String userPassword;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_id
	 * @return  the value of user.user_id
	 * @mbg.generated
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_id
	 * @param userId  the value for user.user_id
	 * @mbg.generated
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_name
	 * @return  the value of user.user_name
	 * @mbg.generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_name
	 * @param userName  the value for user.user_name
	 * @mbg.generated
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_password
	 * @return  the value of user.user_password
	 * @mbg.generated
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_password
	 * @param userPassword  the value for user.user_password
	 * @mbg.generated
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}