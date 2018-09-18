package com.stewart.HelloHuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/human")
public class HumanController {
	
	@GetMapping("")
	public String main(Model model) {
		model.addAttribute("Name", "Humi1");
		return "index.jsp";
	}
	
	@GetMapping("/search")
	public String human(@RequestParam(value="q", required=false) String searchHuman, Model model) {
		// need to search for http://localhost:8080/human/search?q=
		
		if(searchHuman != null) {
			model.addAttribute("Name", searchHuman);
			return "index.jsp";
		}
		model.addAttribute("Name", "Human");
		return "index.jsp";
	}
	
}
