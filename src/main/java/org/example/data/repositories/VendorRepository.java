package org.example.data.repositories;


import org.example.data.models.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendorRepository extends MongoRepository<Vendor,String> {
}
