package com.carrecommender.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vehicles")
public class Vehicle {
    @Id
    private String id;
    private String brand;
    private String model;
    private Double price;
    private String vehicleType;
    private String fuelType;
    private Integer seatingCapacity;
    private Double mileage;
    private Integer safetyRating;
    private Integer performanceRating;
    private Integer luxuryRating;
    private String imageUrl;
    private String dealershipId;
}
