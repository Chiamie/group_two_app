package org.example.data.repositories;

import org.example.data.models.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract,String> {
}