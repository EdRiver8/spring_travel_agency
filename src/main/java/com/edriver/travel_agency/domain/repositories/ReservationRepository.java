package com.edriver.travel_agency.domain.repositories;

import com.edriver.travel_agency.domain.entities.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

public interface ReservationRepository extends CrudRepository<ReservationEntity, UUID> {
    Optional<ReservationEntity> findByPrice(BigDecimal price);
}
