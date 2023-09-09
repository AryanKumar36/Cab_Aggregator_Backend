package dev.cab.aggregator;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverLocationService {
    @Autowired
    private DriverLocationRepository driverLocationRepository;

    public DriverLocation saveDriverLocation(DriverLocation driverLocation)
    {
        return driverLocationRepository.save(driverLocation);
    }

    public List<DriverLocation> getAllDriverLocation()
    {
        return driverLocationRepository.findAll();
    }
}
