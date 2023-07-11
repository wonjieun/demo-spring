package demo.demospring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class BasicController {
    @GetMapping("demo")
    fun helloMvc(model: Model): String {
        model.addAttribute("name", "Jina")
        return "basic-template"
    }

    @GetMapping("demo-mvc")
    fun demoMvc(@RequestParam("name") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "basic-template"
    }
}