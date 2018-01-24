package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.User;
import cn.service.user.UserService;
@Controller()
@RequestMapping(value="/user")
public class UserContoller {
	@Resource
	private UserService userService;
	@RequestMapping("/login")
	public String login(@Param("user")User user){
		List<User> list=userService.login(user);
		if(list!=null&&list.size()>0){
			return "main";
		}else{
			return "redirect:login.jsp";
		}
	}
}
