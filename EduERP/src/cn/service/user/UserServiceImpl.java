package cn.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.user.UserMapper;
import cn.pojo.HomeWork;
import cn.pojo.User;
/**
 * 
 * @author hmx20180125 15:33
 * @updator 
 * 示例：陈海霞2018012516:01
 * 吴军2018012516:02 吴军煌2018012516:03
 * 陈军2018012516:04 陈海霞2018012516:01
 * 叶正雄2018012516:02 示例：end
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> login(User user) {
		return userMapper.findBy(user);
	}
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}
	@Override
	public int update(User user) {
		return userMapper.update(user);
	}
	@Override
	public int delete(User user) {
		return userMapper.delete(user);
	}
	@Override
	public List<User> findList(User user) {
		return userMapper.findBy(user);
	}
}
