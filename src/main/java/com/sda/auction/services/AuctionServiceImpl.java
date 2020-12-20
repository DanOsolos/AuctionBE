package com.sda.auction.services;

import com.sda.auction.entities.Auction;
import com.sda.auction.repositories.AuctionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class AuctionServiceImpl implements AuctionService {

    private final AuctionRepository auctionRepository;

    @Override
    public List<Auction> findAllAuctions() {
        return auctionRepository.findAll();
    }

    @Override
    public void createAuction(Auction auction) {
        auctionRepository.save(auction);
    }

    @Override
    public Optional<Auction> getAuctionById(Integer id) {
        return auctionRepository.findById(id);
    }

    @Override
    public void deleteAuctionById(Integer id) {
        auctionRepository.deleteById(id);
    }

    @Override
    public Auction updateAuction(Auction auction) {
        return auctionRepository.save(auction);
    }
}
