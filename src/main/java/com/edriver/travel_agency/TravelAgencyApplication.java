package com.edriver.travel_agency;

import com.edriver.travel_agency.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class TravelAgencyApplication implements CommandLineRunner {

    private final FlyRepository flyRepository;
    private final HotelRepository hotelRepository;
    private final ReservationRepository reservationRepository;
    private final TicketRepository ticketRepository;
    private final TourRepository tourRepository;
    private final CustomerRepository customerRepository;

    public TravelAgencyApplication(FlyRepository flyRepository, HotelRepository hotelRepository,
                                   ReservationRepository reservationRepository, TicketRepository ticketRepository,
                                   TourRepository tourRepository, CustomerRepository customerRepository) {
        this.flyRepository = flyRepository;
        this.hotelRepository = hotelRepository;
        this.reservationRepository = reservationRepository;
        this.ticketRepository = ticketRepository;
        this.tourRepository = tourRepository;
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        var fly = flyRepository.findById(15L).get();
//        var hotel = hotelRepository.findById(7L).get();
//        var ticket = ticketRepository.findById(UUID.fromString("12345678-1234-5678-2236-567812345678")).get();
//        var reservation = reservationRepository.findById(UUID.fromString("32345678-1234-5678-1234-567812345678")).get();
//        var customer = customerRepository.findById("BBMB771012HMCRR022").get();
//        var reservation1 = reservationRepository.findByPrice(BigDecimal.valueOf(112)).get();

//        log.info(String.valueOf(fly));
//        log.info(String.valueOf(hotel));
//        log.info(String.valueOf(ticket));
//        log.info(String.valueOf(reservation));
//        log.info(String.valueOf(customer));
//        log.info(String.valueOf(reservation1));

        this.flyRepository.selectLessPrice(BigDecimal.valueOf(20)).forEach(f -> System.out.println(f));
        this.flyRepository.selectBetweenPrice(BigDecimal.valueOf(10), BigDecimal.valueOf(15)).forEach(System.out::println);
        this.flyRepository.selectOriginDetiny("Grecia", "Mexico").forEach(System.out::println);
    }
}
