package com.mcb.creditfactory.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("car")
public class AirplaneDto implements Collateral {
    private  Long id;
    private String brand;
    private String model;
    private String manufacturer;
    private Short year_of_issue;
    private int fuelCapacity;
    private int seats;
}
