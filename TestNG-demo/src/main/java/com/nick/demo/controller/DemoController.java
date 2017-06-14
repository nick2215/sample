package com.nick.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("demo")
public class DemoController {

	@RequestMapping(value="init", method = RequestMethod.GET)
	public @ResponseBody String init() {
		System.out.println("demo test success!!!!!!!!");
		return "success";
	}
}
