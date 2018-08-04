package com.dayplanner.dayplanner.controller;

import com.dayplanner.dayplanner.model.Location;
import com.dayplanner.dayplanner.repository.LocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {

    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("/getLocation")
    public Location getLocation(@RequestParam String city){
        return locationRepository.findByCity(city).get();
    }

    @PostMapping("/saveLocation")
    public void saveLocation(@RequestBody Location location){
        locationRepository.save(location);
    }
}
