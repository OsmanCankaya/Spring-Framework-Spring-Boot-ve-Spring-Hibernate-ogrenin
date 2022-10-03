package com.carwasher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private String model;
    private Driver driver;
    private int year;
}
