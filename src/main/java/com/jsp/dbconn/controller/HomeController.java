package com.jsp.dbconn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/show")
	public ModelAndView showData() {
		ModelAndView mv = new ModelAndView();
		
		List<User> datalist = repo.findAll();
		
		mv.addObject("data", datalist);
		mv.setViewName("mydata");
		return mv;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateData(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("address") String address) {
		User updating = repo.findById(id);
		updating.setName(name);
		updating.setAddress(address);
		repo.save(updating);
		return "success";
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteData(@RequestParam("id") int id) {
		repo.deleteById(id);
		ModelAndView mv = new ModelAndView();
		
		List<User> datalist = repo.findAll();
		
		mv.addObject("data", datalist);
		mv.setViewName("mydata");
		return mv;
	}
}
