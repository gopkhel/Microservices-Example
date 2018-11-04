package com.cg.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

	@RequestMapping("/log")
	public void foo() {
		String name = "Alex";
		LOG.info("Hello from Foo.");
		LOG.debug("In foo my name is {}.", name);
	}

}
