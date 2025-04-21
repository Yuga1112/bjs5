package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController {

	//로직이 같을때는 같은 함수 사용
	@GetMapping({"/exLayout1", "/exLayout2", "/fragment2", "/fragment3", "/basic"})
	public void methed() {
		
	}
	
	
}
