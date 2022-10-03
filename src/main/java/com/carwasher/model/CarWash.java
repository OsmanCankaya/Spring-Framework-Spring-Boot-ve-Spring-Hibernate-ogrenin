package com.carwasher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data // Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarWash {

    private int id;
    private Driver driver;
    private Car car;
    private Date date;
    private int price;
}
