package com.Application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {

	@RequestMapping("/index")
	public String homepage() {
		return "index.jsp";
	}
}
