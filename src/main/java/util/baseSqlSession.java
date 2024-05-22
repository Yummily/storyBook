package util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class baseSqlSession {
	private static SqlSessionFactory factory;
	private static SqlSession session;
	private static ThreadLocal<SqlSession> local = new ThreadLocal<>();
	static {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession() {
		session = local.get();
		if (session == null) {
			session = factory.openSession();
			local.set(session);
		}
		
		return session;
	}	
	
	public static void rollBackSqlSession() {
		session.rollback();
	}
	
	public static void commitSqlsession() {
		session.commit();
	}
	
	public static void closeSqlSession() {
		local.remove();
		session.close();
	}
}
