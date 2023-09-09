package dev.cab.aggregator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "driver_locations")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverLocation {
    @Id
    private String id;
    private String driverId;
    private GeoJsonPoint locations;
    private double accuracy;
    private long timestamp;
}
