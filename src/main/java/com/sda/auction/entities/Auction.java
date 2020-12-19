package com.sda.auction.entities;

import liquibase.pro.packaged.B;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "auction")
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String photos;

    @Column (name = "minimum_price")
    private int minimumPrice;

    @Column (name = "buy_now")
    private int buyNow;

    @Column (name = "start_date")
    private LocalDateTime startDate;

    @Column (name = "end_date")
    private LocalDateTime endDate;

    @OneToMany (mappedBy = "auction")
    private List<Bidding> biddingList;

    @OneToOne (mappedBy = "auction")
    private Purchasing purchasing;

    @ManyToOne
    @JoinColumn (name = "category_id")
    private Category category;

}
