package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.PersonDTO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("/ex5")
	public void ex5(Model model) {
		int[] list = {1,2,3,4,5,6,7,8,9,10};
	    model.addAttribute("arr", list);
	}
	
	@GetMapping({"/q6", "/q7", "/q8", "/q9"})
	public void ex6(Model model) {
		        List<PersonDTO> dtoList = new ArrayList<>();
		        dtoList.add(new PersonDTO("둘리",20,"인천 구월동"));
		        dtoList.add(new PersonDTO("또치",30,"서울 신림동"));
		        dtoList.add(new PersonDTO("도우너",40,"부산 문래동"));
		        dtoList.add(new PersonDTO("박하나",25,"인천 구월동"));
		        dtoList.add(new PersonDTO("홍재범",17,"서울 신림동"));
		        dtoList.add(new PersonDTO("문유리",31,"부산 문래동"));
		        dtoList.add(new PersonDTO("김재민",8,"인천 연수동"));
		        dtoList.add(new PersonDTO("장유라",33,"부산 문래동"));
		        model.addAttribute("list", dtoList);
		    }
	

    @GetMapping({"/q8", "/q9"})
    public void ex8(Model model){
        List<PersonDTO> dtoList = new ArrayList<>();
        dtoList.add(new PersonDTO("Aaa",25,"인천 구월동"));
        dtoList.add(new PersonDTO("Bbb",17,"서울 신림동"));
        dtoList.add(new PersonDTO("Ccc",31,"부산 문래동"));
        dtoList.add(new PersonDTO("Ddd",8,"인천 연수동"));
        dtoList.add(new PersonDTO("Eee",33,"부산 문래동"));
        model.addAttribute("list", dtoList);
    }
    
	}



