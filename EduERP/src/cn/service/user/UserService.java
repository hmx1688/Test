package cn.service.user;

import java.util.List;

import cn.pojo.User;

public interface UserService {
	public List<User> login(User user);
}
