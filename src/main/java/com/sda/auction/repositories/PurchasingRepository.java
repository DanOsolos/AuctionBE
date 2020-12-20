package com.sda.auction.repositories;

import com.sda.auction.entities.Purchasing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasingRepository extends JpaRepository<Purchasing, Integer> {
}
