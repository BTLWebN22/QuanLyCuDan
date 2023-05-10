package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
   // private CustomUserDetailsService userService;
    @RequestMapping("/login")
    public String loginForm() {
        return "login";
    }
}