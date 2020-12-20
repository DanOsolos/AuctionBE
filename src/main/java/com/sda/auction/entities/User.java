package com.sda.auction.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column (name = "creation_date", updatable = false)
    private Date creationDate;

    @Column
    private String type;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;

    @OneToMany (mappedBy = "user")
    private List<Bidding> biddingList;

    @OneToMany (mappedBy = "user")
    private List<Purchasing> purchasingList;
}
