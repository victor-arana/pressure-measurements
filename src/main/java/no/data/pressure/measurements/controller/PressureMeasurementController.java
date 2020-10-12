package no.data.pressure.measurements.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PressureMeasurementController {

    @GetMapping("/pressureMeasurement")
    public String getPressureMeasurements(){ return "pressureMeasurements";}
}
