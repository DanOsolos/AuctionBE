package com.sda.auction.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "bidding")
public class Bidding {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn (name = "auction_id")
    private Auction auction;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
}
