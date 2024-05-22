package Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import mapper.ChapterMapper;
import pojo.Chapter;

public class chapterMapperTest extends BaseMapperTest{
	@Test
	public void testSelectAll() {
		SqlSession session = getSqlSession();
		ChapterMapper chapterMapper = session.getMapper(ChapterMapper.class);
		List<Chapter> list = chapterMapper.selectAll();
		for (Chapter chapter : list) {
			System.out.println(chapter.getChapterTitle());
			System.out.println(chapter.getChapterContent());
		}
	}

}
