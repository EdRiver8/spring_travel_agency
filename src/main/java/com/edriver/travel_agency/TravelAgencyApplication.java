package com.edriver.travel_agency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class TravelAgencyApplication{
//    public class TravelAgencyApplication implements CommandLineRunner {

//    private final FlyRepository flyRepository;
//    private final HotelRepository hotelRepository;
//    private final ReservationRepository reservationRepository;
//    private final TicketRepository ticketRepository;
//    private final TourRepository tourRepository;
//    private final CustomerRepository customerRepository;
//
//    public TravelAgencyApplication(FlyRepository flyRepository, HotelRepository hotelRepository,
//                                   ReservationRepository reservationRepository, TicketRepository ticketRepository,
//                                   TourRepository tourRepository, CustomerRepository customerRepository) {
//        this.flyRepository = flyRepository;
//        this.hotelRepository = hotelRepository;
//        this.reservationRepository = reservationRepository;
//        this.ticketRepository = ticketRepository;
//        this.tourRepository = tourRepository;
//        this.customerRepository = customerRepository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
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

//        this.flyRepository.selectLessPrice(BigDecimal.valueOf(20)).forEach(f -> System.out.println(f));
//        this.flyRepository.selectBetweenPrice(BigDecimal.valueOf(10), BigDecimal.valueOf(15)).forEach(System.out::println);
//        this.flyRepository.selectOriginDetiny("Grecia", "Mexico").forEach(System.out::println);

//        var fly = flyRepository.findById(1L).get();
//        fly.getTickets().forEach(ticketEntity -> System.out.println(ticketEntity));
//        var fly = flyRepository.findByTicketId(UUID.fromString("12345678-1234-5678-567812345678"));
//       var hotel = hotelRepository.findById(7L).get();
//        hotelRepository.findByPriceLessThan(BigDecimal.valueOf(100)).forEach(System.out::println);
//        hotelRepository.findByPriceIsBetween(BigDecimal.valueOf(100), BigDecimal.valueOf(150)).forEach(System.out::println);
//        hotelRepository.findByRatingGreaterThan(3).forEach(System.out::println);
//        System.out.println(hotel);

//        var hotel = hotelRepository.findByReservationsId(UUID.fromString("12345678-1234-5678-567812345678"));
//        System.out.println(hotel);

        // no existen Tours en la DB, se crar un Tour Dummy para probar
//        var customer = customerRepository.findById("GOTW771012HMRGR087").orElseThrow();
//        log.info("Client Name: " + customer.getFullName());
//
//        var fly = flyRepository.findById(11L).orElseThrow();
//        log.info("Fly: " + fly.getOriginName() + " - " + fly.getDestinyName());
//        var hotel  = hotelRepository.findById(3L).orElseThrow();
//        log.info("Hotel: " + hotel.getName());
//        var tour = TourEntity.builder()
//                .customer(customer)
//                .build();
//
//        var ticket = TicketEntity.builder()
//                .id(UUID.randomUUID())
//                .price(fly.getPrice().multiply(BigDecimal.TEN))
//                .arrivalDate(LocalDate.now())
//                .departureDate(LocalDate.now())
//                .purchaseDate(LocalDate.now())
//                .customer(customer)
//                .tour(tour)
//                .fly(fly)
//                .build();
//
//        var reservation = ReservationEntity.builder()
//                .id(UUID.randomUUID())
//                .dateTimeReservation(LocalDateTime.now())
//                .dateEnd(LocalDate.now().plusDays(2))
//                .dateStart(LocalDate.now().plusDays(1))
//                .hotel(hotel)
//                .customer(customer)
//                .tour(tour)
//                .totalDays(1)
//                .price(hotel.getPrice().multiply(BigDecimal.TEN))
//                .build();
//
//        tour.addReservation(reservation);
//        tour.updateReservations();
//
//        tour.addTicket(ticket);
//        tour.updateTickets();
//        var tourSaved = this.tourRepository.save(tour);
//        Thread.sleep(8000);
//        this.tourRepository.deleteById(tourSaved.getId());
//    }
}
