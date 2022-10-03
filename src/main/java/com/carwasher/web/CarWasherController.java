package com.carwasher.web;

import com.carwasher.model.Car;
import com.carwasher.model.Driver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"carWasherController"})
public class CarWasherController {
    public CarWasherController() {
    }

    @RequestMapping({"/cars"})
    @ResponseBody
    public List<Car> getCars() {
        ArrayList<Car> cars = new ArrayList();
        Driver driver1 = new Driver(1, "WALTER", "White", "PHONE1", "ADDRESS1");
        Driver driver2 = new Driver(2, "JOHN", "SMITH", "PHONE2", "ADDRESS2");
        Driver driver3 = new Driver(3, "JOHM", "CARTER", "PHONE3", "ADDRESS3");
        Car car1 = new Car(1, "FIAT", "RED", driver1, 2018);
        Car car2 = new Car(2, "OPEL", "BLUE", driver2, 2018);
        Car car3 = new Car(3, "CITROEN", "GRAY", driver3, 2018);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        return cars;
    }

    @RequestMapping("/car/{index}")
    public ResponseEntity<Car> getCar(@PathVariable("index") int index) {
        ArrayList<Car> cars = new ArrayList();
        Driver driver1 = new Driver(1, "WALTER", "White", "PHONE1", "ADDRESS1");
        Driver driver2 = new Driver(2, "JOHN", "SMITH", "PHONE2", "ADDRESS2");
        Driver driver3 = new Driver(3, "JOHM", "CARTER", "PHONE3", "ADDRESS3");
        Car car1 = new Car(1, "FIAT", "RED", driver1, 2018);
        Car car2 = new Car(2, "OPEL", "BLUE", driver2, 2018);
        Car car3 = new Car(3, "CITROEN", "GRAY", driver3, 2018);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        return ResponseEntity.ok(cars.get(index));
    }

    @RequestMapping({"carNameFord"})
    public ModelAndView fordJsp() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ford");
        modelAndView.setViewName("ford");
        return modelAndView;
    }
}
