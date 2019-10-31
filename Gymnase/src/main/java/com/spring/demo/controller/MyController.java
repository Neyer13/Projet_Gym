package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.demo.entity.Gymnases;
import com.spring.demo.repository.GymnaseRepository;

@Controller
public class MyController {
	
	@Autowired
	GymnaseRepository gymnaseRepo;

	@RequestMapping(value="/")
	public String homeSport() {
		return"home";
	}

	@RequestMapping(value="/home")
	public String home() {
		return"home";
	}
	
	@RequestMapping(value = "/sport")
	public String sport() {
		return"Sport";
	}

	@RequestMapping(value = "/gymnase", method = RequestMethod.GET)
	public String gymnase(Model model) {
		
		/*List<Gymnases> listGym =  gymnaseRepo.findAll();
		
		model.addAttribute("listGym", listGym);*/
		
		return "gymnase";
	}
	
	@RequestMapping(value = "/ville")
	public String ville() {
		return"Ville";
	}

	@RequestMapping(value = "/jour")
	public String jour() {
		return"jour";
	}
}
