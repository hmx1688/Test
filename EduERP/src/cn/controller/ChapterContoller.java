package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pojo.Chapter;
import cn.service.chapter.ChapterService;

@Controller
@RequestMapping(value="/chapter")
public class ChapterContoller {
	@Resource
	private ChapterService chapterService;
	@RequestMapping("/Chapter")
	/*public ModelAndView findBy(@RequestParam(value="chapter",required=false)Chapter chapter,Model model){
		List<Chapter> List = chapterService.findBy(chapter);
		ModelAndView modelAndView = new ModelAndView();  
	    modelAndView.addObject("List", List);  
	    modelAndView.setViewName("Chapter"); 
	    model.addAttribute("List",List);
	    return modelAndView;
	}*/
	public String findby(@RequestParam(value="chapter",required=false)Chapter chapter,Model model){
		List<Chapter> List = chapterService.findBy(chapter);
		model.addAttribute("List", List);
		return "Chapter";
	}
	/*
	 * 删除
	 */
	/*@RequestMapping("/delete")
	public String delete(@RequestParam(value="chapter",required=false)Chapter chapter,Model model){
		int i=chapterService.delete(chapter);
		return "Chapter";
	}*/
}
