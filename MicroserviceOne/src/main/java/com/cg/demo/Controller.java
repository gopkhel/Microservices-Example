package com.cg.demo;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

	@GetMapping("/name")
	public String getName() {
		System.out.println("************");
		return "Hi Nawaz, How are you";
	}

	@PostMapping("/add/a/{a}/b/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		System.out.println("Returning values from base controller");
		return a+30 + b;
	}

}
