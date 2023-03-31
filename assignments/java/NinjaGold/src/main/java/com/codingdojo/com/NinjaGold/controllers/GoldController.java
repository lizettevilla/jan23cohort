package com.codingdojo.com.NinjaGold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoldController {
	@RequestMapping("/")
	public String index(HttpSession session) {

//		ArrayList<String> activities = new ArrayList<String>();
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			
			ArrayList<String> activities = new ArrayList<String>();
			session.setAttribute("activities", activities);
		}		
		return "index.jsp";
	}
	
	@PostMapping("gold/{place}")
	public String gold(@PathVariable String place, HttpSession session, Model model) {
		LocalDateTime ldt = LocalDateTime.now(); // used to set time in string later

		// change the gold value
		int change = 0;		
		switch(place) {
			case "farm":
				change = 10 + (int)(Math.random() * 20);
				break;
			case "cave":
				change = 5 + (int)(Math.random() * 10);
				break;
			case "house":
				change = 2 + (int)(Math.random() * 5);
				break;
			case "quest":
				change = 50 - (int)(Math.random() * 100);
				break;
			default:
				break;
		}
		
		// add an activity string
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a");
		ArrayList<String> activities;	
		if(session.getAttribute("activities") == null) {
			activities = new ArrayList<String>();
		}
		else {
			activities = (ArrayList<String>) session.getAttribute("activities");
		}
		
		if(change < 0) {
			activities.add(0, "You failed a " + place + " and lost " + -change + " gold. Ouch. (" + ldt.format(formatter) + ")\n");
		}
		else {
			activities.add(0, "You entered a " + place + " and earned " + change + " gold. (" + ldt.format(formatter) + ")\n");
		}
		
		// update session values
		int count = change + (int)session.getAttribute("count");
		session.setAttribute("count", count);
		session.setAttribute("activities", activities);
		
		return "redirect:/";
	}
	
	@PostMapping("reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}