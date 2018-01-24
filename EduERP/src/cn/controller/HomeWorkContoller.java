package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.HomeWork;
import cn.service.homework.HomeWorkService;
@Controller
@RequestMapping(value="/homeWork")
public class HomeWorkContoller {
	@Resource
	private HomeWorkService homeWorkService;
	@RequestMapping("/homeWork.html")
	public String cx(@Param("homeWork")HomeWork homeWork,Model model){
		List<HomeWork> homeWorklist=homeWorkService.cx(homeWork);
		model.addAttribute("homeWorklist", homeWorklist);
			return "homeWorklist";
	}
	
}
