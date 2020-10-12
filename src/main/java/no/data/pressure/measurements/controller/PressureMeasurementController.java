package no.data.pressure.measurements.controller;

import no.data.pressure.measurements.model.PressureMeasurement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class PressureMeasurementController {

    @GetMapping("/pressureMeasurement")
    public PressureMeasurement getPressureMeasurements(){
        PressureMeasurement pressureMeasurement = new PressureMeasurement();
        pressureMeasurement.setId(1L);
        pressureMeasurement.setDateTime(LocalDateTime.now());
        pressureMeasurement.setSystolicPressure(130);
        pressureMeasurement.setDiastolicPressure(80);
        pressureMeasurement.setHeartRate(70);
        return pressureMeasurement;
    }
}
