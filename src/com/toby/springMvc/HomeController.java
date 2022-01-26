package com.toby.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String mainPage() {
		return "Main";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "summary";
	}
	
	@RequestMapping("/inputForm")
	public String inputForm() {
		return "input";
	}
}
