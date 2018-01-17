package cn.dao.job;

import java.util.List;

import cn.pojo.Job;

public interface JobMapper {

	public List<Job> findBy(Job job); //查询
	public int addjob(Job job); //添加
	public int updatejov(Job job); //修改
	public int delete(Job job); //删除
}
