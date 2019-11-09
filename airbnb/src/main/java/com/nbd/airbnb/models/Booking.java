package com.nbd.airbnb.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Booking {
    public ObjectId _id;
    @Id
    public Integer id;
    public String name;
    public Integer host_id;
    public String host_name;
    public String neighbourhood_group;
    public String neighbourhood;
    public Double latitude;
    public Double longitude;
    public String room_type;
    public Integer price;
    public Integer minimum_nights;
    public Integer number_of_reviews;
    public String last_review;
    public String reviews_per_month;
    public Integer calculated_host_listings_count;
    public Integer availability_365;


    public Booking(ObjectId _id, Integer id, String name, Integer host_id, String host_name, String neighbourhood_group, String neighbourhood, Double latitude, Double longitude, String room_type, Integer price, Integer minimum_nights, Integer number_of_reviews, String last_review, String reviews_per_month, Integer calculated_host_listings_count, Integer availability_365) {
        this._id = _id;
        this.id = id;
        this.name = name;
        this.host_id = host_id;
        this.host_name = host_name;
        this.neighbourhood_group = neighbourhood_group;
        this.neighbourhood = neighbourhood;
        this.latitude = latitude;
        this.longitude = longitude;
        this.room_type = room_type;
        this.price = price;
        this.minimum_nights = minimum_nights;
        this.number_of_reviews = number_of_reviews;
        this.last_review = last_review;
        this.reviews_per_month = reviews_per_month;
        this.calculated_host_listings_count = calculated_host_listings_count;
        this.availability_365 = availability_365;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHost_id(Integer host_id) {
        this.host_id = host_id;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public void setNeighbourhood_group(String neighbourhood_group) {
        this.neighbourhood_group = neighbourhood_group;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setMinimum_nights(Integer minimum_nights) {
        this.minimum_nights = minimum_nights;
    }

    public void setNumber_of_reviews(Integer number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    public void setLast_review(String last_review) {
        this.last_review = last_review;
    }

    public void setReviews_per_month(String reviews_per_month) {
        this.reviews_per_month = reviews_per_month;
    }

    public void setCalculated_host_listings_count(Integer calculated_host_listings_count) {
        this.calculated_host_listings_count = calculated_host_listings_count;
    }

    public void setAvailability_365(Integer availability_365) {
        this.availability_365 = availability_365;
    }
}

