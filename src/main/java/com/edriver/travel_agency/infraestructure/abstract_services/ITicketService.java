package com.edriver.travel_agency.infraestructure.abstract_services;

import com.edriver.travel_agency.api.models.request.TicketRequest;
import com.edriver.travel_agency.api.models.responses.TicketResponse;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public interface ITicketService extends CrudService<TicketRequest, TicketResponse, UUID> {

    BigDecimal findPrice(Long flyId, Currency currency);

}
