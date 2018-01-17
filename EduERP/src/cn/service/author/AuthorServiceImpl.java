package cn.service.author;

import java.util.List;

import javax.annotation.Resource;

import cn.dao.author.AuthorMapper;
import cn.pojo.Author;

public class AuthorServiceImpl implements AuthorService {
	@Resource
	private AuthorMapper authorMapper;
	@Override
	public List<Author> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> findBy(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Author author) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Author author) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Author author) {
		// TODO Auto-generated method stub
		return 0;
	}

}
