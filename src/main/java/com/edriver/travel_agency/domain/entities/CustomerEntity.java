package com.edriver.travel_agency.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerEntity {
    @Id
    private String dni;
    @Column(name = "full_name", length = 50)
    private String fullName;
    @Column(name = "credit_card", length = 20)
    private String creditCard;
    @Column(name = "phone_number", length = 12)
    private String phoneNumber;
    @Column(name = "total_flights")
    private Integer totalFlights;
    @Column(name = "total_lodgings")
    private Integer totalLodgings;
    @Column(name = "total_tours")
    private Integer totalTours;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private Set<TicketEntity> tickets;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private Set<ReservationEntity> reservations;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private Set<TourEntity> tours;

}
