package com.edriver.travel_agency.domain.repositories.jpa;

import com.edriver.travel_agency.domain.entities.TourEntity;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity, Long> {

}
