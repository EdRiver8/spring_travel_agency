package com.edriver.travel_agency.infraestructure.abstract_services;

import com.edriver.travel_agency.api.models.request.TourRequest;
import com.edriver.travel_agency.api.models.responses.TourResponse;

import java.util.UUID;

public interface ITourService extends SimpleCrudService<TourRequest, TourResponse, Long> {

    void removeTicket(Long tourId, UUID ticketId);

    UUID addTicket(Long flyId, Long tourId);

    void removeReservation(Long tourId, UUID reservationId);

    UUID addReservation(Long flyId, Long tourId, Integer totalDays);
}
