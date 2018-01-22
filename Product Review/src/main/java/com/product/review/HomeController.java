package com.product.review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.model.User;
import com.product.service.UserService;


@Controller
@Scope("session")
public class HomeController {
	
	@Autowired
	UserService uService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		System.out.println("1-"+session.getAttribute("uname"));
		session.removeAttribute("uname");
		session.invalidate();
		return "index";
	}
	
	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	public String doLogin(@RequestParam("userid")String uName, @RequestParam("pwd")String uPass, Model model, HttpServletRequest req) {
		if(uService.validateUser(uName, uPass)) {
			model.addAttribute("username", uName);
			HttpSession session = req.getSession();
			session.setAttribute("uname", uName);
			return "home";
		}
		return "login";
	}
	@RequestMapping(value = "/dologin", method = RequestMethod.GET)
	public String loginn() {
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
			return "register";
	}
	
	@RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("reg")User u, Model m) {
		System.out.println(u);
		if(uService.addUser(u)) {
			m.addAttribute("regMsg", "Registeration Sucess");
			return "register";
		}
		m.addAttribute("regMsg", "Registeration Failed...");
		return "register";
	}
}
