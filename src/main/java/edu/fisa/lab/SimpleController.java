package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("gettest")
	public String get() {
		System.out.println("************");
		return "젠킨스 깃헙 깃배쉬 믹스미션";
	}
}
