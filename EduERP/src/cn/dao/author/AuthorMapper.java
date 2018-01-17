package cn.dao.author;

import java.util.List;

import cn.pojo.Author;


public interface AuthorMapper {
	public List<Author> findAll();
	public List<Author> findBy(Author author);
	public int update(Author author);
	public int delete(Author author);
	public int insert(Author author);
}
