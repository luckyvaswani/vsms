package com.vsms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//@RequestMapping("/home")
@Controller
public class HomeController {
	@RequestMapping("")
	public String homePage(Model model) {

		return "index.jsp";
	}
}
