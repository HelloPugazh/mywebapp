package com.webApp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/msg") 
	public String getString() {
		return "Hi all.... welcome";
	}

}
