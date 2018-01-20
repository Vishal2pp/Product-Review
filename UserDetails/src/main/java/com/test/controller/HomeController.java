package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.Login;
import com.test.model.User1;
import com.test.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home1";
	}
	
	@RequestMapping(value = "/loginUser", method = RequestMethod.GET)
	public String showAddUser() {
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRemoveUser() {
		return "register";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("credentials")Login login, Model model) {
		
		if(userService.validateUserName(login))
		{
			if(userService.validatepassword(login))
			{	
				//previous code	
				if(userService.validateUser(login))
				{
					//login successful, redirecting user to welcome page  
					model.addAttribute("UserName","Welcome "+login.getUserName());
					
					return "welcome";
				}
				else
				{
					model.addAttribute("username",login.getUserName());
					model.addAttribute("spanPassword", "*Please enter valid Password");
					return "login";
				}
			}
			else
			{
				model.addAttribute("username",login.getUserName());
				model.addAttribute("password",login.getPassword());
				model.addAttribute("spanPassword", "*Please enter Password");
				return "login";
			}
		}
		else if(userService.validatepassword(login))
		{
			if(userService.validateUser(login))
			{
				//login successful, redirecting user to welcome page  
				model.addAttribute("UserName","Welcome "+login.getUserName());
				return "welcome";
			}
			else
			{
				model.addAttribute("username",login.getUserName());
				return "login";
			}
		}
		else
		{	
			model.addAttribute("flag", "false");
			model.addAttribute("spanUserName", "*Please enter User Name");
			model.addAttribute("spanPassword", "*Please enter Password");
			return "login";
		}
		
			
//		model.addAttribute("UserName", login.getUserName());
//		model.addAttribute("Password", login.getPassword());
//		return "welcome";
		
		
	}
	
	
	
}
