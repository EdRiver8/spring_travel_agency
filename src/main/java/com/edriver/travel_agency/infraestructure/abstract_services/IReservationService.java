package com.edriver.travel_agency.infraestructure.abstract_services;

import com.edriver.travel_agency.api.models.request.ReservationRequest;
import com.edriver.travel_agency.api.models.responses.ReservationResponse;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResponse, UUID> {

     BigDecimal findPrice(Long hotelId, Currency currency);

}
