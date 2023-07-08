package demo.demospring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BasicController {
    @GetMapping("hello-mvc")
    fun helloMvc(model: Model): String {
        model.addAttribute("name", "Jina")
        return "basic-template"
    }
}