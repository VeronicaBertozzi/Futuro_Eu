package io.cucumber.veronica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {
    
    @GetMapping("/")
	public String index() {
		return "home/index";
	}
}
