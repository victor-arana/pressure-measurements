package no.data.pressure.measurements.controller;

import no.data.pressure.measurements.dao.PressureMeasurementRepository;
import no.data.pressure.measurements.entity.PressureMeasurementEntity;
import no.data.pressure.measurements.model.PressureMeasurement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PressureMeasurementController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PressureMeasurementRepository repository;

    @GetMapping("/pressureMeasurements")
    public List<PressureMeasurement> getPressureMeasurements(){
       List<PressureMeasurementEntity> pressureMeasurementEntities = repository.findAll();
       return pressureMeasurementEntities.stream()
               .map(this::mapToDto)
               .collect(Collectors.toList());
    }

    @PostMapping("/pressureMeasurements")
    PressureMeasurement create(@RequestBody PressureMeasurement pressureMeasurement){
        PressureMeasurementEntity entity = mapToEntity(pressureMeasurement);
        PressureMeasurementEntity savedEntity = repository.save(entity);
        return mapToDto(savedEntity);
    }

    private PressureMeasurementEntity mapToEntity(PressureMeasurement pressureMeasurement) {
        PressureMeasurementEntity pressureMeasurementEntity = modelMapper.map(pressureMeasurement, PressureMeasurementEntity.class);
        return pressureMeasurementEntity;
    }

    private PressureMeasurement mapToDto(PressureMeasurementEntity pressureMeasurementEntity) {
        PressureMeasurement pressureMeasurement = modelMapper.map(pressureMeasurementEntity, PressureMeasurement.class);
        return pressureMeasurement;
    }
}
