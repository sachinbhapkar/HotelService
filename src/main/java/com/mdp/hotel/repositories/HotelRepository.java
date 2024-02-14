package com.mdp.hotel.repositories;

import com.mdp.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
