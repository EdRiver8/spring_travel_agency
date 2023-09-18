package com.edriver.travel_agency.domain.repositories;

import com.edriver.travel_agency.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}
