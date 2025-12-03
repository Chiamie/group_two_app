package org.example.data.repositories;
import org.example.data.models.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository  extends MongoRepository<Guest, String> {

}
