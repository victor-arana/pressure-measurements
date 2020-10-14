package no.data.pressure.measurements.dao;

import no.data.pressure.measurements.entity.PressureMeasurementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PressureMeasurementRepository extends JpaRepository<PressureMeasurementEntity, Long> { }
