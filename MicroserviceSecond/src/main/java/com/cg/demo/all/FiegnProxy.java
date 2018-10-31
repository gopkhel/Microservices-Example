package com.cg.demo.all;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "microservices-one", url = "localhost:8001")
public interface FiegnProxy {

	@GetMapping("/name")
	public String getName();

	@PostMapping("/add/a/{a}/b/{b}")
	public int add(@PathVariable int a, @PathVariable int b);
}
