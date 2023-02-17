package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantPlacesController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String read() {
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "index";
	}
	
	@PostMapping("/index")
	public String create() {
		return "index";
	}
	
	@RequestMapping("/")
	public String start() {
		return "index";
	}
}
