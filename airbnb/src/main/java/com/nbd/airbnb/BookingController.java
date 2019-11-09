package com.nbd.airbnb;

import com.nbd.airbnb.models.Booking;
import com.nbd.airbnb.repositories.AirbnbRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookingController
{
    @Autowired
    private AirbnbRepository repository;

    @PostMapping(value = "/booking")
    public Booking addBooking(@Valid @RequestBody Booking booking)
    {
        if (getBooking(booking.getId()) == null)
        {
            booking.set_id(ObjectId.get());
            repository.save(booking);
            return booking;
        }
        return null;
    }

    @GetMapping("/booking/{id}")
    public Booking getBooking(@PathVariable Integer id)
    {
        return repository.findOneById(id);
    }

    @GetMapping("/bookings")
    public List<Booking> getAllBookings()
    {
        return repository.findAll();
    }

    @PutMapping("/booking/{id}")
    public void updateBooking(@PathVariable Integer id, @Valid @RequestBody Booking booking)
    {
        booking.setId(id);
        repository.save(booking);
    }

    @DeleteMapping("booking/{id}")
    public void deleteBooking(@PathVariable Integer id)
    {
        repository.delete(repository.findOneById(id));
    }
}
