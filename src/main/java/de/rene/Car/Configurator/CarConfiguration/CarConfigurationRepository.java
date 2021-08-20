package de.rene.Car.Configurator.CarConfiguration;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarConfigurationRepository extends MongoRepository<CarConfiguration, String> {

    public CarConfiguration findByName(String name);
}
