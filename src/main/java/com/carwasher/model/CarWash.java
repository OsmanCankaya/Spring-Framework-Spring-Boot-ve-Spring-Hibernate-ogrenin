package com.carwasher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data // Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CarWash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //private Driver driver;
    @ManyToOne
    private Car car;
    private Date date;
    private int price;
}
