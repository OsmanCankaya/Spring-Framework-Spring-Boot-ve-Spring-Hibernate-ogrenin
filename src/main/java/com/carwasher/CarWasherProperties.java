package com.carwasher;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "carwasher")
@Data
public class CarWasherProperties {
    private String loadTestData="no";

}
