package com.mdp.hotel.services;

import com.mdp.hotel.entities.Hotel;

import java.util.List;


public interface HotelService {

    Hotel createHotel(Hotel hotel);
    List<Hotel> getAll();
    Hotel getHotel(String id);
}
