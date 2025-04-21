package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.SampleDTO;


@Controller
@RequestMapping("/sample")
//sample은 중간경로 / 클래스 안에 있는 모든 함수에 적용
public class SampleController {

	
	@GetMapping({"/ex5", "/ex6", "/ex7","/ex8"})
	public void ex5(Model model) {
		List<SampleDTO> list = new ArrayList<>();
		list.add(new SampleDTO(1, "aa", LocalDate.now()));
		list.add(new SampleDTO(2, "bb", LocalDate.now()));
		list.add(new SampleDTO(3, "cc", LocalDate.now()));
		model.addAttribute("list", list);
	}
	
	@GetMapping("/ex9")
	public void ex9(Model model) {
		//DTo 타입 리스트 생성
		List<SampleDTO> list = new ArrayList<>();
		//데이터 20개
		for(int i=1; i<=20; i++) {
			SampleDTO dto = new SampleDTO(i, i+"번", LocalDate.now());
			list.add(dto);
		}
		//화면전달
		model.addAttribute("list", list);
	}
	
	//전체경로: /sample/ex10
	//리턴타입이 void => url 경로가 파일의 경로가 됨	
	//리턴타입이 string => 파일의 경로를 직접 작성
	
	//Model : 컨드롤러에서 뷰로 데이터를 전달하는 객체
	@GetMapping("/ex10")
	public void ex10(Model model) {
	
		//dto 생성
		SampleDTO dto = new SampleDTO(1, "aaa", LocalDate.now());
		
		// 화면에 객체 데이터를 전달
		model.addAttribute("dto", dto);
		// 화면에 문자열 데이터를
		model.addAttribute("msg", "success");
	}
	
	//전체 url: /sample/ex11
	//반환타입 : void = > url 경로가 파일의 경로가 됨
	//파일의 경로 : sample 폴더아래 ex11.html
	//매개변수 : 파라미터 / model
	//model : 컨트롤러에서 화면을 데이터를 전달하는 객체
	@GetMapping("/ex11")
	public void ex11(Model model) {
	
		//화면에 현재시간
		model.addAttribute("date", LocalDateTime.now());
		
		//
		
	}
	
}

/*
 * v : view - 
 * 순수한 html -> 정적인 페이지
 * 템플릿엔진 (jsp Thymeleaf) -> 동적인 페이지
 * 
 * jsp - wedapp
 * Thymeleaf - tempplates
 * */
