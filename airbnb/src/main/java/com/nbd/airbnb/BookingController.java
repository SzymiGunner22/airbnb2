package com.nbd.airbnb;


import com.nbd.airbnb.models.Booking;
import com.nbd.airbnb.repositories.AirbnbRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private AirbnbRepository repository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Booking> getAllBookings(){
        return repository.findAll();
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.GET)
    public Booking getPetById(@PathVariable("_id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Booking createBooking(@Valid @RequestBody Booking book) {
        book.set_id(ObjectId.get());
        repository.save(book);
        return book;
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public void deleteBooking(@PathVariable ObjectId _id) {
        repository.delete(repository.findBy_id(_id));
    }
}
