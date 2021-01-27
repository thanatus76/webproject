package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		log.info("main");
		
		return "main";
	}
	
}
