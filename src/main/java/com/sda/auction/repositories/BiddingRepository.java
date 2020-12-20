package com.sda.auction.repositories;

import com.sda.auction.entities.Bidding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiddingRepository extends JpaRepository<Bidding, Integer> {
}
