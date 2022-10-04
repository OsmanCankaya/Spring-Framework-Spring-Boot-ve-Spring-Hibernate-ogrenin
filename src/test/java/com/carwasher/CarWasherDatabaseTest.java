package com.carwasher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CarWasherDatabaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void getCars() {
        var queryForList = jdbcTemplate.queryForList("select * from car");
        System.out.println("Size of cars: " + queryForList.size());
    }

    @Test
    public void getCar() {
        var map = jdbcTemplate.queryForMap("select * from car where id=?", 2);
        System.out.println("Car model is: " + map.get("model"));
        System.out.println("Car id is: " + map.get("id"));
        System.out.println("Car color is: " + map.get("color"));
    }
}
