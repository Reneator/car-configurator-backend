package de.rene.Car.Configurator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/configs")
public class CarConfigurationController {

    @Autowired
    private CarConfigurationRepository repository;

    @RequestMapping("/{name}")
    public CarConfiguration home(String name) {
        CarConfiguration config = repository.findByName(name);
        return config;
    }

    @RequestMapping("/all")
    public List<CarConfiguration> getAll() {
        List<CarConfiguration> configurations = repository.findAll();
        return configurations;
    }

}
