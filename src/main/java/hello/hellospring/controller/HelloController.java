package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class HelloController {
    @GetMapping("hello") // http 메서드 GET, 주소 slash 뒤에 hello
    public String hello(Model model) {
        model.addAttribute("data", "test!!");
        return "hello";  // hello.html
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";

    }
}
