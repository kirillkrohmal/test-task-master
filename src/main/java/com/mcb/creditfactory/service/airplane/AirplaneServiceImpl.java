package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirplaneDto;
import com.mcb.creditfactory.dto.CarDto;
import com.mcb.creditfactory.external.ExternalApproveService;
import com.mcb.creditfactory.model.Airplane;
import com.mcb.creditfactory.model.Car;
import com.mcb.creditfactory.repository.AirplaneRepository;
import com.mcb.creditfactory.repository.CarRepository;
import com.mcb.creditfactory.service.car.CarAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AirplaneServiceImpl implements AirplaneService {
    @Autowired
    private ExternalApproveService approveService;

    @Autowired
    private AirplaneRepository airplaneRepository;


    @Override
    public boolean approve(AirplaneDto airplaneDto) {
        return false;
    }

    @Override
    public Car save(Airplane airplane) {
        return null;
    }

    @Override
    public Optional<Airplane> load(Long id) {
        return airplaneRepository.findById(id);
    }

    @Override
    public Airplane fromDto(AirplaneDto airplaneDto) {
        return null;
    }

    @Override
    public CarDto toDTO(Airplane airplane) {
        return null;
    }

    @Override
    public Long getId(Airplane airplane) {
        return null;
    }

}
