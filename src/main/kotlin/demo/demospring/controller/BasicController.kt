package demo.demospring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class BasicController {
    @GetMapping("demo")
    fun helloMvc(model: Model): String {
        val name = "Jina"
        model.addAttribute("name", name)
        return "basic-template"
    }

    @GetMapping("demo-mvc")
    fun demoMvc(@RequestParam("name") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "basic-template"
    }

    @GetMapping("demo-string")
    @ResponseBody
    fun demoString(@RequestParam("name") name: String): String {
        return "hello $name"
    }

    @GetMapping("demo-api")
    @ResponseBody
    fun demoApi(@RequestParam("name") name: String): Demo {
        val demo = Demo()
        demo.name = name
        return demo
    }

    class Demo {
        var name = ""
    }
}