package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetChiPhi {
	@GetMapping("/chiphi")
	public String hienThi() {
		return "chiphi";
	}
}
