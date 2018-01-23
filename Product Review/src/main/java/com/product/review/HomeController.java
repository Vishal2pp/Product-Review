package com.product.review;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String fupload() {
		return "upload";
	}
	
	 @Autowired
     ServletContext context;

	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody
	String uploadFileHandler(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				String rootPath = context.getRealPath("/resources/images");
				System.out.println("path="+rootPath);

				File serverFile = new File(rootPath + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "failed to upload " + name + " because the file was empty.";
		}
	}

}
