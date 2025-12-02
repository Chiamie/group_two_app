package org.example.data.repositories;

import org.example.data.models.Contract;
import org.example.data.models.Couple;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoupleRepository extends MongoRepository<Couple,String> {
}