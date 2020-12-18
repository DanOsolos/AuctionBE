package com.sda.auction.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String photos;

    @Column (name = "category_id")
    private int categoryId;

    @Column (name = "minimum_price")
    private int minimumPrice;

    @Column (name = "buy_now")
    private int buyNow;

    @Column (name = "start_date")
    private Date startDate;

    @Column (name = "end_date")
    private Date endDate;
}
