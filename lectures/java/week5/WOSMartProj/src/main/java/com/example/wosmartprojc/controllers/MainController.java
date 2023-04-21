package com.example.wosmartprojc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.wosmartprojc.models.LoginUser;
import com.example.wosmartprojc.models.User;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/logReg")
	public String logRed(HttpSession session, Model model) {
		if(session.getAttribute("user_id") != null) {
			return "redirect:/dashboard";
		} else {
			model.addAttribute("newUser", new User());
			model.addAttribute("newLogin", new LoginUser());
			return "logReg.jsp";
		}
		
	}
}
