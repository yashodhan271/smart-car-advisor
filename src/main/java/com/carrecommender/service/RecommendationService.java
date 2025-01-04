package com.carrecommender.service;

import com.carrecommender.model.UserPreference;
import com.carrecommender.model.Vehicle;
import com.carrecommender.repository.VehicleRepository;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getRecommendations(UserPreference preferences) {
        // Get initial filtered list based on basic criteria
        List<Vehicle> filteredVehicles = getFilteredVehicles(preferences);
        
        // Apply AI scoring
        return rankVehicles(filteredVehicles, preferences);
    }

    private List<Vehicle> getFilteredVehicles(UserPreference preferences) {
        // Basic filtering based on user preferences
        return vehicleRepository.findAll().stream()
                .filter(v -> v.getPrice() <= preferences.getBudget())
                .filter(v -> preferences.getVehicleType() == null || 
                           v.getVehicleType().equals(preferences.getVehicleType()))
                .filter(v -> preferences.getPreferredBrand() == null || 
                           v.getBrand().equals(preferences.getPreferredBrand()))
                .filter(v -> preferences.getSeatingCapacity() == null || 
                           v.getSeatingCapacity() >= preferences.getSeatingCapacity())
                .collect(Collectors.toList());
    }

    private List<Vehicle> rankVehicles(List<Vehicle> vehicles, UserPreference preferences) {
        // Create a scoring system based on user preferences
        return vehicles.stream()
                .sorted((v1, v2) -> calculateScore(v2, preferences) - calculateScore(v1, preferences))
                .limit(5)
                .collect(Collectors.toList());
    }

    private int calculateScore(Vehicle vehicle, UserPreference preferences) {
        int score = 0;
        
        // Safety priority
        if (Boolean.TRUE.equals(preferences.getSafetyPriority())) {
            score += vehicle.getSafetyRating() * 2;
        }
        
        // Performance priority
        if (Boolean.TRUE.equals(preferences.getPerformancePriority())) {
            score += vehicle.getPerformanceRating() * 2;
        }
        
        // Luxury priority
        if (Boolean.TRUE.equals(preferences.getLuxuryPriority())) {
            score += vehicle.getLuxuryRating() * 2;
        }
        
        // Fuel efficiency priority
        if (Boolean.TRUE.equals(preferences.getFuelEfficiencyPriority())) {
            score += vehicle.getMileage().intValue();
        }
        
        return score;
    }
}
