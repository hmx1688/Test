package cn.service.message;

import java.util.List;

import cn.pojo.Message;
/**
 * 新闻通知公告
 * @author cml、clq
 *
 */
public interface MessageService {
	public int insertMessage(Message message);	//添加新闻通知公告表信息
    public int updateMessage(Message message);	//修改新闻通知公告表信息
    public int deleteMessage(Message message);	//删除新闻通知公告表信息
	public List<Message> findAll();				//查询新闻通知公告表的所有信息
	public List<Message> findBy(Message message);//按条件查询新闻通知公告表的信息
}
