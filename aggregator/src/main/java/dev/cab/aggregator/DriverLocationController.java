package dev.cab.aggregator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/driver-locations")
public class DriverLocationController {
    @Autowired
    private DriverLocationService driverLocationService;

    @PostMapping
    public ResponseEntity<DriverLocation> addDriverLocation(DriverLocation driverLocation)
    {
        return new ResponseEntity<DriverLocation>(driverLocationService.saveDriverLocation(driverLocation),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DriverLocation>> getAllDriverLocation()
    {
        return new ResponseEntity<List<DriverLocation>>(driverLocationService.getAllDriverLocation(),HttpStatus.OK);
    }
}
