package cn.service.user;

import java.util.List;

import cn.pojo.User;
/**
 * 
 * @author hmx20180125 15:33
 * @updator 
 * 
 */
public interface UserService {
	public List<User> login(User user);
	public List<User> findAll();
	public List<User> findList(User user);
	public int insert(User user);
	public int update(User user);
	public int delete(User user);
}
