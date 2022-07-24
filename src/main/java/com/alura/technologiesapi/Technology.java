package com.alura.technologiesapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mainTechnologies")
public record Technology(@Id String id,String technologyName, String image, int ranking){}
