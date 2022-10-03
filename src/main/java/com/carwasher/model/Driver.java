package com.carwasher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private  int id;
    private  String name;
    private String surname;
    private String phone;
    private String address;
}
