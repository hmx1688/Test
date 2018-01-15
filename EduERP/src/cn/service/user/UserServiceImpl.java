package cn.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.user.UserMapper;
import cn.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> login(User user) {
		return userMapper.findBy(user);
	}
}
