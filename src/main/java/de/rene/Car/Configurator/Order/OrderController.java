package de.rene.Car.Configurator.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @GetMapping("/{id}")
    public Order getById(String id) {
        Optional<Order> config = repository.findById(id);
        return config.get();
    }

    @PostMapping("/")
    public Order addConfig(Order order) {
        Order savedOrder = repository.insert(order);
        return savedOrder;
    }

    @PutMapping("/")
    public Order updateConfig(Order order) {
        Order savedOrder = repository.insert(order);
        return savedOrder;
    }

    @DeleteMapping("/{id}")
    public void delete(String id) {
        Optional<Order> config = repository.findById(id);
        if (config.isPresent()) {
            repository.delete(config.get());
            System.out.println("Successfully Deleted id: " + id);
        } else {
            System.out.println("No Order found for id:" + id);
        }
    }

    @GetMapping("/all")
    public List<Order> getAll() {
        List<Order> orders = repository.findAll();
        return orders;
    }
}
