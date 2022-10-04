package com.carwasher.web;

import com.carwasher.jpa.CarWasherRepository;
import com.carwasher.model.Car;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping({"carWasherController"})
@NoArgsConstructor
public class CarWasherController {

    @Autowired
    private CarWasherRepository repository;

    @RequestMapping({"/cars"})
    public List<Car> getCars() {
        return repository.getCars();
    }

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable int id) {
        return repository.getCar(id);
    }

    @RequestMapping({"carNameFord"})
    public ModelAndView fordJsp() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ford");
        modelAndView.setViewName("ford");
        return modelAndView;
    }
}
