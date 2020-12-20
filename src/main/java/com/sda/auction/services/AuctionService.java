package com.sda.auction.services;


import com.sda.auction.entities.Auction;

import java.util.List;
import java.util.Optional;

public interface AuctionService {

    List<Auction> findAllAuctions();
    void createAuction(Auction auction);
    Optional<Auction> getAuctionById (Integer id);
    void deleteAuctionById(Integer id);
    Auction updateAuction (Auction auction);
}
