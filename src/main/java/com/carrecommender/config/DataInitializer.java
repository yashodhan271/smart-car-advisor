package com.carrecommender.config;

import com.carrecommender.model.Vehicle;
import com.carrecommender.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void run(String... args) {
        // Clear existing data
        vehicleRepository.deleteAll();

        // Create sample vehicles
        List<Vehicle> vehicles = Arrays.asList(
            createVehicle("Toyota", "RAV4", 32000.0, "SUV", "Hybrid", 5, 30.0, 9, 8, 7),
            createVehicle("Honda", "Civic", 25000.0, "Sedan", "Petrol", 5, 35.0, 8, 7, 6),
            createVehicle("BMW", "X5", 62000.0, "SUV", "Petrol", 7, 22.0, 9, 9, 9),
            createVehicle("Tesla", "Model 3", 45000.0, "Sedan", "Electric", 5, 0.0, 9, 9, 8),
            createVehicle("Toyota", "Camry", 28000.0, "Sedan", "Hybrid", 5, 32.0, 8, 7, 7),
            createVehicle("Mercedes-Benz", "E-Class", 55000.0, "Sedan", "Petrol", 5, 25.0, 9, 8, 9),
            createVehicle("Hyundai", "Tucson", 27000.0, "SUV", "Petrol", 5, 28.0, 8, 7, 6),
            createVehicle("Ford", "Mustang", 48000.0, "Sports", "Petrol", 4, 20.0, 7, 9, 8),
            createVehicle("Audi", "Q7", 58000.0, "SUV", "Diesel", 7, 24.0, 9, 8, 9),
            createVehicle("Volkswagen", "Golf", 23000.0, "Hatchback", "Petrol", 5, 32.0, 8, 7, 6),
            createVehicle("Lexus", "RX", 52000.0, "SUV", "Hybrid", 5, 28.0, 9, 8, 9),
            createVehicle("Porsche", "911", 98000.0, "Sports", "Petrol", 2, 18.0, 8, 10, 10),
            createVehicle("Kia", "Seltos", 24000.0, "SUV", "Petrol", 5, 30.0, 8, 7, 6),
            createVehicle("Mazda", "CX-5", 29000.0, "SUV", "Petrol", 5, 28.0, 8, 8, 7),
            createVehicle("Subaru", "Outback", 31000.0, "SUV", "Petrol", 5, 29.0, 9, 7, 7)
        );

        // Save all vehicles
        vehicleRepository.saveAll(vehicles);
        
        System.out.println("Sample data initialized successfully!");
    }

    private Vehicle createVehicle(String brand, String model, Double price, String type, 
                                String fuelType, Integer seats, Double mileage,
                                Integer safety, Integer performance, Integer luxury) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setPrice(price);
        vehicle.setVehicleType(type);
        vehicle.setFuelType(fuelType);
        vehicle.setSeatingCapacity(seats);
        vehicle.setMileage(mileage);
        vehicle.setSafetyRating(safety);
        vehicle.setPerformanceRating(performance);
        vehicle.setLuxuryRating(luxury);
        vehicle.setImageUrl("https://example.com/" + model.toLowerCase().replace(" ", "-") + ".jpg");
        vehicle.setDealershipId("dealer-" + brand.toLowerCase());
        return vehicle;
    }
}
