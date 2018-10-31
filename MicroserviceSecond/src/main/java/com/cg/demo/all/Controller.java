package com.cg.demo.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

	@Autowired
	private FiegnProxy proxy;

	@GetMapping("/feign")
	public String callFeign() {
		return proxy.getName();
	}

	@PostMapping("/feign/num1/{num1}/num2/{num2}")
	public int add(@PathVariable int num1, @PathVariable int num2) {
		return proxy.add(num1, num2);
	}
}
