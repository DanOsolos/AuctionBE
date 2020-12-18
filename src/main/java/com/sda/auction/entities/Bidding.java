package com.sda.auction.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;K

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bidding {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column (name = "auction_id")
    private int auctionId;

    @Column (name = "user_id")
    private int userId;

    @Column
    private int price;

}
