package com.edriver.travel_agency.infraestructure.abstract_services;

import com.edriver.travel_agency.api.models.responses.FlyResponse;

import java.util.Set;

public interface IFlyService extends CatalogService<FlyResponse> {

    Set<FlyResponse> readByOriginDestiny(String origen, String destiny);
}
