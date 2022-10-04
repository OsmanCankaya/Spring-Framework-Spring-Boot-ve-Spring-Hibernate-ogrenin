package com.carwasher.jpa;

import com.carwasher.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CarWasherRepository {
    @Autowired
    private EntityManager entityManager;

    public List<Car> getCars() {
        return entityManager.createQuery("from Car", Car.class).getResultList();
    }

    public Car getCar(int id) {
        return entityManager.find(Car.class, id);
    }
}
