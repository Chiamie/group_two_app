package org.example.data.repositories;


import org.example.data.models.Vendor;
import org.example.data.models.Wedding;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeddingRepository extends MongoRepository<Wedding,String> {
}