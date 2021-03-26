package org.esig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationInit {
	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/form")
	public String form() {
		return "404";
	}
}
