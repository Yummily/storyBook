package Test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.test.context.event.annotation.BeforeTestClass;

public class BaseMapperTest {
	private static SqlSessionFactory factory;
	@BeforeAll
	public static void init(){
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public SqlSession getSqlSession() {
		return factory.openSession();
	}
}
