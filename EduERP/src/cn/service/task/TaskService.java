package cn.service.task;

import java.util.List;
import cn.pojo.Task;
/**
 * 任务接口
 * @author cml、cql
 *
 */
public interface TaskService {
	public List<Task> findBy(Task task);
}
