package com.jsp.dbconn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.dbconn.dao.UserRepository;
import com.jsp.dbconn.model.User;

@Controller
public class HomeController {

	@Autowired
	UserRepository repo;
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String save(User user) {
		repo.save(user);
		return "success";
	}
}
