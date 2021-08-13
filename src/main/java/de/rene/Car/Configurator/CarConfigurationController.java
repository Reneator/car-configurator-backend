package de.rene.Car.Configurator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/carconfiguration")
@RestController
public class CarConfigurationController {

    @Autowired
    private CarConfigurationRepository repository;

    @RequestMapping("/{name}")
    public String home(String name) {
        repository.save(new CarConfiguration("Car 1"));
        List<CarConfiguration> configurations = repository.findAll();
        return configurations.get(0).toString();
//        return "Hello Docker World!";
    }

    @RequestMapping("/all")
    public List<CarConfiguration> getAll() {
        repository.save(new CarConfiguration("Car 1"));
        List<CarConfiguration> configurations = repository.findAll();
        return configurations;
    }

}
