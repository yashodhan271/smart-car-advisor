package com.carrecommender.repository;

import com.carrecommender.model.UserPreference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserPreferenceRepository extends MongoRepository<UserPreference, String> {
}
