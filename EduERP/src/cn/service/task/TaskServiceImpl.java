package cn.service.task;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.task.TaskMapper;
import cn.pojo.Task;


@Service
public class TaskServiceImpl implements TaskService {
	@Resource
	private TaskMapper taskMapper;
	public TaskMapper getTaskMapper() {
		return taskMapper;
	}
	public void setTaskMapper(TaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}
	@Override
	public List<Task> findBy(Task task){
		return taskMapper.findBy(task);
	}
}
