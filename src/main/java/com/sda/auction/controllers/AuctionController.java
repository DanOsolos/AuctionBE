package com.sda.auction.controllers;

import com.sda.auction.entities.Auction;
import com.sda.auction.entities.User;
import com.sda.auction.exceptions.AuctionNotFoundException;
import com.sda.auction.services.AuctionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class AuctionController {

    private final AuctionService auctionService;
    private static final String PATH = "/auction";

    @GetMapping("/auctions")
    public List<Auction> findAllAuctions(){
        return auctionService.findAllAuctions();
    }

    @GetMapping(PATH + "/{id}")
    public Auction getAuctionById (@PathVariable("id") Integer id) throws AuctionNotFoundException {
        return auctionService.getAuctionById(id);
    }

    @PostMapping(PATH)
    public void createAuction (@RequestBody Auction auction){
        auctionService.createAuction(auction);
    }

    @DeleteMapping(PATH + "/{id}")
    public void deleteUserById (@PathVariable("id") Integer id) {
        auctionService.deleteAuctionById(id);
    }

    @PutMapping(PATH)
    public Auction updateAuction(@RequestBody Auction auction){
        return auctionService.updateAuction(auction);
    }

}
