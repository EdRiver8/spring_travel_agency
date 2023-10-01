package com.edriver.travel_agency.infraestructure.abstract_services;

import com.edriver.travel_agency.api.models.responses.HotelResponse;

import java.util.Set;

public interface IHotelService extends CatalogService<HotelResponse> {

    Set<HotelResponse> readByRating(Integer rating);
}
