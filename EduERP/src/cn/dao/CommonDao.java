package cn.dao;

import java.util.List;

public interface CommonDao<T> {
	public int update(T t);
	public int delete(T t);
	public int insert(T t);
	public List<T> findAll();
	public List<T> findBy(T t);
}
