package com.carrecommender.controller;

import com.carrecommender.model.UserPreference;
import com.carrecommender.model.Vehicle;
import com.carrecommender.service.RecommendationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
@Tag(name = "Vehicle Recommendations", description = "API for vehicle recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @PostMapping
    @Operation(summary = "Get vehicle recommendations based on user preferences")
    public ResponseEntity<List<Vehicle>> getRecommendations(@Valid @RequestBody UserPreference preferences) {
        List<Vehicle> recommendations = recommendationService.getRecommendations(preferences);
        return ResponseEntity.ok(recommendations);
    }
}
