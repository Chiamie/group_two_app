package org.example.data.repositories.lakikiRepo;

import org.example.data.models.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepository extends MongoRepository<Guest,String> {


}
