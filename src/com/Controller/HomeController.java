package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Entity.Student;
import com.Service.UserService;

@Controller
public class HomeController {

//	@RequestMapping(value = "/log")
//	public String getLogRequest() {
//
//		System.out.println("Login Page Controller");
//		return "Success";
//
//	}
	
	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/reg")
	public String SignUp(@ModelAttribute Student st) {
		System.out.println("I am in controller layer");
		
		us.Register(st);
		
		return "login";
	
	}
}
