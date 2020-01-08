package be.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Welcome";
    }

    @GetMapping("/api/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }
}

