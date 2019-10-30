package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
	  	    
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

	@RequestMapping(value ="/", method=RequestMethod.GET)
	public String homeAmpty() {
		return"home";
	}
	
	@RequestMapping(value = "/sport")
	public String sport() {
		return"Sport";
	}
	
	@RequestMapping(value = "/gymnase")
	public String gymnase() {
		return"gymnase";
	}
	@RequestMapping(value = "/ville")
	public String ville() {
		return"Ville";
	}

	@RequestMapping(value = "/jour")
	public String jour() {
		return"Jour";
	}
	
}
