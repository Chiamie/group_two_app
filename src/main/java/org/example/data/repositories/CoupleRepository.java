package org.example.data.repositories;

import org.example.data.models.Couple;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoupleRepository extends MongoRepository<Couple, String> {
}
