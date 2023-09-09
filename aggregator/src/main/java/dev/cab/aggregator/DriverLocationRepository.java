package dev.cab.aggregator;

import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverLocationRepository extends MongoRepository<DriverLocation, String> {
}
