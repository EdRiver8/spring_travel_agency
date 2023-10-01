package com.edriver.travel_agency.domain.repositories.jpa;

import com.edriver.travel_agency.domain.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {

}
