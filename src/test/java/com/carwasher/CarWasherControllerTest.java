package com.carwasher;

import com.carwasher.model.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CarWasherControllerTest {
    private RestTemplate restTemplate;

    @Before
    public void init() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getCarsTest() {
        var cars = restTemplate.getForObject("http://localhost:8080/carWasherController/cars", List.class);
        System.out.println("Size Of The Car List : " + cars.size());
    }

    @Test
    public void getCar() {
        Car car = restTemplate.getForObject("http://localhost:8080/carWasherController/car/1", Car.class);

        System.out.println("Car model is: " + car.getModel());
    }
}
