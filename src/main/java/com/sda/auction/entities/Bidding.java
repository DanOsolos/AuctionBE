package com.sda.auction.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bidding {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private int price;

    @ManyToOne
    @JoinColumn (name = "auction_id")
    private Auction auction;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
}
