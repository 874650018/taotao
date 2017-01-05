package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	/**
	 * 打开其他页
	 * @param page
	 * @return
	 */
	
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}



}
