package com.alura.technologiesapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Technology, String>{
    
}