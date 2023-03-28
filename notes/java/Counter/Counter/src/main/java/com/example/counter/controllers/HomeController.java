package com.example.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@PostMapping("/omikuji")
	public String omikuji(@RequestParam Integer num, @RequestParam String city, @RequestParam String name, @RequestParam String hobby, @RequestParam String thing, @RequestParam String something, Model model, HttpSession session) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("something", something);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String show() {
		return "results.jsp";
	}
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count = 0;
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			count = (Integer) session.getAttribute("count");
			session.setAttribute("count", ++count);
					
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}

}
