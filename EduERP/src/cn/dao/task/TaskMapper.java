package cn.dao.task;

import java.util.List;
import cn.pojo.Task;

/**
 * 任务接口
 * @author cml、clq
 *
 */
public interface TaskMapper {
	public int insertTask(Task task);	//添加任务表信息
    public int updateTask(Task task);	//修改任务表信息
    public int deleteTask(Task task);	//删除任务表信息
	public List<Task> findAll();		//查询任务表的所有信息
	public List<Task> findBy(Task task);//按条件查询任务表的信息
}
