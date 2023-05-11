package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetCondominum {
	@GetMapping("/condominum")
	public String canHo() {
		return "condominum";
	}
}
