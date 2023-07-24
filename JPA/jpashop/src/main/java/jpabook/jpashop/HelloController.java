package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) { // Model 로 데이터를 view 에 넘김
        model.addAttribute("data", "hello!");
        return "hello"; // return 화면이름
    }
}
