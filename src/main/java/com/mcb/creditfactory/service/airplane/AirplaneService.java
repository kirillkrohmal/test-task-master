package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirplaneDto;
import com.mcb.creditfactory.dto.CarDto;
import com.mcb.creditfactory.model.Airplane;
import com.mcb.creditfactory.model.Car;

import java.util.Optional;

public interface AirplaneService {
    boolean approve(AirplaneDto airplaneDto);
    Car save(Airplane airplane);
    Optional<Airplane> load(Long id);
    Airplane fromDto(AirplaneDto airplaneDto);
    CarDto toDTO(Airplane airplane);
    Long getId(Airplane airplane);
}
