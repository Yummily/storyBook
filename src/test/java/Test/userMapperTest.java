package Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import mapper.UserMapper;
import pojo.Book;
import pojo.Type;
import pojo.User;

public class userMapperTest extends BaseMapperTest{
	
	@Test
	public void testSelectAll() {
		SqlSession session = getSqlSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> list = userMapper.selectAll();
			Assert.assertNotNull(list);
			for (User user : list) {
				System.out.println(user.getUserName() + " " + user.getUserPassword());
			}
		} finally {
			session.close();
			// TODO: handle finally clause
		}
	}
	
	@Test
	public void testSelectUserAndBook() {
		SqlSession session = getSqlSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.selectUserAndBook(1);
			Assert.assertNotNull(user);
			System.out.println(user.getUserName());
			for (Book book: user.getBookList()) {
				System.out.println(book.getBookName());
			}
		} finally {
			session.close();
			// TODO: handle finally clause
		}
	}

	
	@Test
	public void testSelectUserAndBookAndType() {
		SqlSession session = getSqlSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.selectUserAndBookAndType(1);
			Assert.assertNotNull(user);
			System.out.println(user.getUserName());
			for (Book book: user.getBookList()) {
				System.out.print(book.getBookName()+" ");
				for (Type type:book.getTypeList()) {
					System.out.print(type.getTypeName() + " ");
				}
				System.out.println();
			}
		} finally {
			session.close();
			// TODO: handle finally clause
		}
	}

}
