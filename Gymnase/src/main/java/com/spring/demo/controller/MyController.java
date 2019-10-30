package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	 
	    @RequestMapping(value="/")
	    public String homeSport() {
	        return"home";
	    }
	    
	    @RequestMapping(value="/home")
	    public String home() {
	        return"home";
	    }
	    
}
