package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetApartment {
	@GetMapping("/apartment")
	public String getApartment() {
		return "apartment";
	}
}
