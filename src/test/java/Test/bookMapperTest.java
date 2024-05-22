package Test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import mapper.BookMapper;
import pojo.Book;

public class bookMapperTest extends BaseMapperTest{
	@Test
	public void testInsert() {
		SqlSession session = getSqlSession();
		try {
			BookMapper bookMapper = session.getMapper(BookMapper.class);
			Book book = new Book();
			book.setBookName("《呜呜呜》");
			book.setCreateBy("1");
			book.setStatus(1);
			book.setCreateTime(new Date());
			bookMapper.insert(book);
		
		} finally {
			session.commit();
			session.close();
			// TODO: handle finally clause
		}
		
	}
	
	
	
}
