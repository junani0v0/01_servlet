package com.portfolio.www.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	public IndexController() {
		System.out.println("-----------------------------------생성됨-----------------------------");
	}
	@RequestMapping("/index.do")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/input.do")
	public String inputPage() {
		return "input";
	}	
	
	@RequestMapping("/output.do")
	public ModelAndView outputPage(@RequestParam HashMap<String, String> params) {
		System.out.println(params);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("output");
		mv.addObject("measureDate", "2024-01-11");
		return mv;
	}

	
}
