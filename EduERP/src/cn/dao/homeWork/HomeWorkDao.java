package cn.dao.homeWork;

import java.util.List;

import cn.pojo.HomeWork;

public interface HomeWorkDao {
	public int update(HomeWork homeWork);
	public int delete(HomeWork homeWork);
	public int insert(HomeWork homeWork);
	public List<HomeWork> findAll();
	public List<HomeWork> findBy(HomeWork homeWork);
}
