package org.example.data.repositories;

import org.example.data.models.Contract;
import org.example.data.models.Couple;
import org.example.data.models.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface GuestRepository  extends MongoRepository<Guest,String> {
}
