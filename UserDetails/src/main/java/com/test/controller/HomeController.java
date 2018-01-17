package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.Login;
import com.test.model.User;
import com.test.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	//@Qualifier(value="")
	private UserService userService;
	
	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	@RequestMapping(value = "/showAddUser", method = RequestMethod.GET)
	public String showAddUser() {
		return "addUser";
	}
	
	@RequestMapping(value = "/showRemoveUser", method = RequestMethod.GET)
	public String showRemoveUser() {
		return "removeUser";
	}
	
	@RequestMapping(value = "/showUpdateUser", method = RequestMethod.GET)
	public String showUpdateUser() {
		return "updateUser";
	}
	
	@RequestMapping(value="/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("user")Login u, Model model) {
		if(userService.doLogin(u)) {
			model.addAttribute("name",u);
			return "home";
		}else {
			model.addAttribute("msg","Invalid credentials..");
			return "login";
		}
	}
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user")User u, Model model) {
		if(userService.addUser(u)) {
			model.addAttribute("msg",u.getUserName()+" added successfully.");
			return "addUser";
		}else {
			model.addAttribute("msg","Failed to add user.Try again");
			return "addUser";
		}
	}
	
	@RequestMapping(value="/removeUser", method = RequestMethod.POST)
	public String removeUser(@ModelAttribute("user")User u, Model model) {
		if(userService.removeUser(u)) {
			model.addAttribute("msg",u.getUserName()+" removed successfully.");
			return "removeUser";
		}else {
			model.addAttribute("msg","Failed to remove user.Try again");
			return "removeUser";
		}
	}
	
	@RequestMapping(value="/updateUser", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("u")User u, Model model) {
		if(userService.updateUser(u)) {
			model.addAttribute("msg",u.getUserName()+" updated successfully.");
			return "updateUser";
		}else {
			model.addAttribute("msg","Failed to update user.Try again");
			return "updateUser";
		}
	}
}
