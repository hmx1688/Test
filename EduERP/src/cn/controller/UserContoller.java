package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pojo.User;
import cn.service.user.UserService;
/**
 * 
 * @author hmx20180125 15:33
 * @updator
 */
@Controller
@RequestMapping(value="/user")
public class UserContoller {
	@Resource
	private UserService userService;
	@RequestMapping("/page")
	@ResponseBody
	public List<User> page(Model model){
		List<User> userList=userService.findAll();
		return userList;
	}
	@RequestMapping("/list")
	public String list(Model model){
		List<User> userList=userService.findAll();
		model.addAttribute("userList", userList);
		return "userList";
	}
	@RequestMapping("/login")
	public String login(@Param("user")User user,Model model){
		List<User> list=userService.login(user);
		if(list!=null&&list.size()>0){
			List<User> userList=userService.findAll();
			model.addAttribute("userList", userList);
			return "main";
		}else{
			return "redirect:login.jsp";
		}
	}
	@RequestMapping("/addUser")
	public String preAddUser(){
		return "/user/addUser";
	}
	@RequestMapping("/doAddUser")
	public String doAddUser(User user){
		int isadd=userService.insert(user);
		if(isadd>0){
			return "redirect:/user/list";
		}
		return "redirect:/user/addUser";
	}
	@RequestMapping("/delete")
	public String delete(User user){
		int isdelete=userService.delete(user);
		if(isdelete>0){
			return "redirect:/user/list";
		}
		return "redirect:/user/addUser";
	}
	@RequestMapping("/preUpdate")
	public String preUpdate(User user,Model model){
		List<User> list=userService.findList(user);
		if(list!=null&&list.size()>0){
			model.addAttribute("user", list.get(0));
			return "/user/updateUser";
		}
		return "redirect:/user/list";
	}
	@RequestMapping("/update")
	public String update(User user){
		int isup=userService.update(user);
		if(isup>0){
			return "redirect:/user/list";
		}
		return "redirect:/user/preUpdate";
	}
}
