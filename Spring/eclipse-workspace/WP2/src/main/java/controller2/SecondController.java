package controller2;

import org.springframework.stereotype.Controller;

@Controller
public class SecondController {
	@RequestMapping("/firstjsp.jsp")
	public String hello1() {
		return "Second.jsp";
	}
}
