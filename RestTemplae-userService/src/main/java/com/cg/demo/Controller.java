package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private RestTemplate template;

	@GetMapping("/mesg")
	public String getYourMesgThroughRestTemplate() {
		String mesg = template.getForObject("http://localhost:8888/get", String.class);
		return mesg;
	}

}
