package com.carrecommender.repository;

import com.carrecommender.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    List<Vehicle> findByPriceLessThanEqual(Double maxPrice);
    List<Vehicle> findByVehicleType(String vehicleType);
    List<Vehicle> findByBrand(String brand);
}
