package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars() {
        return "cars";
    }
}
