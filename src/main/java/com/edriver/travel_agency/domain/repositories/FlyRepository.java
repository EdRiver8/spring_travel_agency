package com.edriver.travel_agency.domain.repositories;

import com.edriver.travel_agency.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.Set;

public interface FlyRepository extends JpaRepository<FlyEntity, Long>{

    @Query("select f from FlyEntity as f where f.price < :price")
    Set<FlyEntity> selectLessPrice(BigDecimal price);

    @Query("select f from FlyEntity as f where f.price between :min and :max")
    Set<FlyEntity> selectBetweenPrice(BigDecimal min, BigDecimal max);

    @Query("select f from FlyEntity as f where f.originName = :origin and f.destinyName = :destiny")
    Set<FlyEntity> selectOriginDetiny(String origin, String destiny);

}
