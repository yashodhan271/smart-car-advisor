package com.carrecommender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.carrecommender.repository")
@OpenAPIDefinition(
    info = @Info(
        title = "Vehicle Recommendation API",
        version = "1.0",
        description = "AI-Based Vehicle Recommendation System"
    )
)
public class VehicleRecommendationApplication {
    public static void main(String[] args) {
        SpringApplication.run(VehicleRecommendationApplication.class, args);
    }
}
