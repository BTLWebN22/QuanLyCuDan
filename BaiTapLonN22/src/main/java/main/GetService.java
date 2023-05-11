package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetService {
	@GetMapping("/dichvu")
	public String goiDichVu() {
		return "dichvu";
	}
}
