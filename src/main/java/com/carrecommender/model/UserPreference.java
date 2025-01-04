package com.carrecommender.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user_preferences")
public class UserPreference {
    @Id
    private String id;
    
    @NotNull
    @Positive
    private Double budget;
    
    private String preferredBrand;
    private String vehicleType; // SUV, Sedan, etc.
    private String fuelType;
    private Integer seatingCapacity;
    private String primaryUse; // CITY, HIGHWAY, BOTH
    private Boolean safetyPriority;
    private Boolean fuelEfficiencyPriority;
    private Boolean luxuryPriority;
    private Boolean performancePriority;
}
