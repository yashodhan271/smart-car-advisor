package com.carrecommender.config;

import com.carrecommender.model.Vehicle;
import com.carrecommender.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void run(String... args) {
        // Clear existing data
        vehicleRepository.deleteAll();

        // Create sample vehicles
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setBrand("Toyota");
        vehicle1.setModel("RAV4");
        vehicle1.setPrice(32000.0);
        vehicle1.setVehicleType("SUV");
        vehicle1.setFuelType("Hybrid");
        vehicle1.setSeatingCapacity(5);
        vehicle1.setMileage(30.0);
        vehicle1.setSafetyRating(9);
        vehicle1.setPerformanceRating(8);
        vehicle1.setLuxuryRating(7);
        vehicle1.setImageUrl("https://example.com/rav4.jpg");
        vehicle1.setDealershipId("dealer1");

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setBrand("Honda");
        vehicle2.setModel("Civic");
        vehicle2.setPrice(25000.0);
        vehicle2.setVehicleType("Sedan");
        vehicle2.setFuelType("Petrol");
        vehicle2.setSeatingCapacity(5);
        vehicle2.setMileage(35.0);
        vehicle2.setSafetyRating(8);
        vehicle2.setPerformanceRating(7);
        vehicle2.setLuxuryRating(6);
        vehicle2.setImageUrl("https://example.com/civic.jpg");
        vehicle2.setDealershipId("dealer2");

        Vehicle vehicle3 = new Vehicle();
        vehicle3.setBrand("BMW");
        vehicle3.setModel("X5");
        vehicle3.setPrice(62000.0);
        vehicle3.setVehicleType("SUV");
        vehicle3.setFuelType("Petrol");
        vehicle3.setSeatingCapacity(7);
        vehicle3.setMileage(22.0);
        vehicle3.setSafetyRating(9);
        vehicle3.setPerformanceRating(9);
        vehicle3.setLuxuryRating(9);
        vehicle3.setImageUrl("https://example.com/x5.jpg");
        vehicle3.setDealershipId("dealer3");

        // Save vehicles to database
        vehicleRepository.saveAll(Arrays.asList(vehicle1, vehicle2, vehicle3));
    }
}
