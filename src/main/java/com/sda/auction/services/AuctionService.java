package com.sda.auction.services;


import com.sda.auction.entities.Auction;
import com.sda.auction.exceptions.AuctionNotFoundException;

import java.util.List;
import java.util.Optional;

public interface AuctionService {

    List<Auction> findAllAuctions();
    void createAuction(Auction auction);
    Auction getAuctionById (Integer id) throws AuctionNotFoundException;
    void deleteAuctionById(Integer id);
    Auction updateAuction (Auction auction);
}
