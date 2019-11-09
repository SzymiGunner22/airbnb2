package com.nbd.airbnb.repositories;

import com.nbd.airbnb.models.Booking;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirbnbRepository extends MongoRepository<Booking,Integer> {
    Booking findBy_id(Integer id);

}
