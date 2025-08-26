package gowtham.living.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class service2 {
    @GetMapping("/service")
    public String hello() {
        return "Hello from Service 2";
    }
    @GetMapping("/greet")
    public String greet() {
        return "Greetings from Service 2!";
    }
    @GetMapping("/status")
    public String status() {
        return "Service 2 is up and running!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }
}
