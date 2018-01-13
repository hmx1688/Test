package cn.dao;

import java.util.List;

public interface Dictionary {
	public int update(Dictionary dictionary);		//修改
	public int delete(Dictionary dictionary);		//删除
	public int insert(Dictionary dictionary);		//插入
	public List<Dictionary> findAll();				//查找
	public List<Dictionary>	findBy(Dictionary dictionary);//按条件查找
}
