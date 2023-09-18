package com.edriver.travel_agency.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import util.Airline;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "fly")
@NoArgsConstructor @AllArgsConstructor
@Data
@Builder
public class FlyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "origin_lat")
    private Double originLat;
    @Column(name = "origin_lng")
    private Double oirginLng;
    @Column(name = "destiny_lng")
    private Double destinyLat;
    @Column(name = "destiny_lat")
    private Double detinyLng;
    private BigDecimal price;
    @Column(name = "origin_name", length = 20)
    private String originName;
    @Column(name = "destiny_name", length = 20)
    private String destinyName;

    @Enumerated(EnumType.STRING)
    private Airline airline;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "fly",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private Set<TicketEntity> tickets;
}
