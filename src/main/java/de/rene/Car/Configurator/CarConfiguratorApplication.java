package de.rene.Car.Configurator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CarConfiguratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarConfiguratorApplication.class, args);
	}

}
