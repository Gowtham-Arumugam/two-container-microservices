package gowtham.living.service1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class service1 {
    @GetMapping("/service1")
    public String hello() {
        return "Hello from Service 1";
    }
    @GetMapping("/service1/greet")
    public String greet() {
        return "Greetings from Service 1 !!!!";
    }
    @GetMapping("/service1/status")
    public String status() {
        return "Service 1 is running smoothly!";
    }
}
