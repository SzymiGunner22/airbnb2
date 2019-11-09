package com.nbd.airbnb;

import com.nbd.airbnb.models.Booking;
import com.nbd.airbnb.repositories.AirbnbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookingController
{
    @Autowired
    private AirbnbRepository repository;

    @PostMapping("/booking")
    public Booking addBooking(@Valid @RequestBody Booking booking)
    {
        if (getBooking(booking.getId()) == null)
        {
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
        booking.set_id(getBooking(id).get_id());
        booking.setId(id);
        repository.save(booking);
    }

    @DeleteMapping("booking/{id}")
    public void deleteBooking(@PathVariable Integer id)
    {
        repository.delete(repository.findOneById(id));
    }
}
