package de.rene.Car.Configurator.Order;

import de.rene.Car.Configurator.CarConfiguration.CarConfiguration;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

public class Order {

    @Id
    public String id;

    public DateTime dateTime;

    public CarConfiguration configuration;

}
