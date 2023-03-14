package vn.capa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class CapaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CapaApplication.class, args);
    }

    @GetMapping
    String home() {
        return "Hello demo";
    }
}
