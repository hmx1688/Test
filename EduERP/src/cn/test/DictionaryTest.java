package cn.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.util.MyBatisUtil;

public class DictionaryTest {
	private Logger logger= Logger.getLogger(DictionaryTest.class);
	@Test
	public void test() {
		int count=0;
		SqlSession sqlSession=null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			count = sqlSession.selectOne("cn.dao.providerMapper.count");
			logger.debug("providerMapper Count----->" + count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.colseSql(sqlSession);
			
		
	}

}
}
