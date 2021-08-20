package de.rene.Car.Configurator;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<CarConfiguration, String> {
}
