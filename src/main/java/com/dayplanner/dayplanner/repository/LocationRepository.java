package com.dayplanner.dayplanner.repository;

import com.dayplanner.dayplanner.model.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LocationRepository extends CrudRepository<Location, Long> {

    Optional<Location> findByCity(String cityName);
}
