package dk.via.viatab.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "My name is Waqar Ahmed Khan. I would like to join the IoT / Backend / Machine Learning group.";
    }
}