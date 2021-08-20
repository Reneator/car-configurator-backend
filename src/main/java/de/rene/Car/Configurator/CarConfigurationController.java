package de.rene.Car.Configurator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/configs")
public class CarConfigurationController {

    @Autowired
    private CarConfigurationRepository repository;
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/{id}")
    public CarConfiguration getById(String id) {
        Optional<CarConfiguration> config = repository.findById(id);
        return config.get();
    }
    @PostMapping("/")
    public CarConfiguration addConfig(CarConfiguration configuration) {
        CarConfiguration config = repository.insert(configuration);
        return config;
    }
    @PostMapping("/json")
    public CarConfiguration addConfigByJson(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        CarConfiguration config = mapper.readValue(json, CarConfiguration.class);
        CarConfiguration newConfig = repository.insert(config);
        return newConfig;
    }
    @PutMapping("/")
    public CarConfiguration updateConfig(CarConfiguration configuration) {
        CarConfiguration config = repository.insert(configuration);
        return config;
    }
    @DeleteMapping("/{id}")
    public void delete(String id) {
        Optional<CarConfiguration> config = repository.findById(id);
        if(config.isPresent()){
            repository.delete(config.get());
            System.out.println("Successfully Deleted id: "+ id);
        } else {
            System.out.println("No Configuration found for id:" + id);
        }
    }

    @GetMapping("/all")
    public List<CarConfiguration> getAll() {
        List<CarConfiguration> configurations = repository.findAll();
        return configurations;
    }
    @PostMapping("/order")
    public CarConfiguration addOrder(CarConfiguration configuration) {
        CarConfiguration config = orderRepository.insert(configuration);
        return config;
    }

}
