package com.sda.auction.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String city;

    @Column
    private String province;

    @ToString.Exclude
    @JsonIgnore
    @OneToOne
    @JoinColumn (name = "user_id")
    private User user;
}
