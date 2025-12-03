package org.example.data.repositories;

import org.example.data.models.Wedding;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface WeddingRepository extends MongoRepository<Wedding,String> {
}
