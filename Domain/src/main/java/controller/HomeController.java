package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //localhost 입장 후 첫 번째 호출단
    public String home() {
        return "home"; //resources.templates. home.html 호출

    }
}
