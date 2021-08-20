package de.rene.Car.Configurator.CarConfiguration;

import org.springframework.data.annotation.Id;

import java.util.List;

public class CarConfiguration {

    @Id
    public String id;

    public int basePrice;

    public String name;

    public List<ConfigurationOption> engine;
    public List<ConfigurationOption> extras;
    public List<ConfigurationOption> paintjob;
    public List<ConfigurationOption> rims;

    public CarConfiguration(String name) {
        this.name = name;
    }
}
