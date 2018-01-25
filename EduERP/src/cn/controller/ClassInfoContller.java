package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pojo.ClassInfo;
import cn.service.classinfo.ClassInfoService;

@Controller()
@RequestMapping(value="/classInfo")
public class ClassInfoContller {
	@Resource
	private ClassInfoService classInfoService;
	@RequestMapping("/classInfo.html")
	public String findBy(@RequestParam(value="classinfo",required=false)ClassInfo classinfo,Model model){
		List<ClassInfo> List = classInfoService.findBy(classinfo);
		model.addAttribute("List",List);
		return "classInfolist";
	}
}