package com.occamsrazor.web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootConfiguration  //springboot할 때 실행
@Controller //--->new homecontroller가 자동으로 붙어서 인스턴스가 되었다
public class HomeController {
	@GetMapping("/")
	public String hello() {
	return "index.html";
	}
}
