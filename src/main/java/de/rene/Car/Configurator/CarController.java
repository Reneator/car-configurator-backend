package de.rene.Car.Configurator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World!";
    }
}
