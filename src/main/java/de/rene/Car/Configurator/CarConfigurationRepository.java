package de.rene.Car.Configurator;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface CarConfigurationRepository extends MongoRepository<CarConfiguration, String> {

    public CarConfiguration findByName(String name);
}
