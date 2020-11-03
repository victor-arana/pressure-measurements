package no.data.pressure.measurements.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class PressureMeasurement {
    private Integer systolicPressure;
    private Integer diastolicPressure;
    private Integer heartRate;
    private LocalDateTime dateTime;
}
