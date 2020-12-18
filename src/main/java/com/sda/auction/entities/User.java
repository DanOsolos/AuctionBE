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
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column (name = "creation_date")
    private Date creationDate;

    @Column
    private String type;
}
