package com.sda.auction.controllers;

import com.sda.auction.entities.Auction;
import com.sda.auction.entities.User;
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

    @GetMapping("/auctions")
    public List<Auction> findAllAuctions(){
        return auctionService.findAllAuctions();
    }

    @GetMapping("/auction/{id}")
    public Optional<Auction> getAuctionById (@PathVariable("id") Integer id) {
        return auctionService.getAuctionById(id);
    }

    @PostMapping("/auction")
    public void createAuction (@RequestBody Auction auction){
        auctionService.createAuction(auction);
    }

    @DeleteMapping("/auction/{id}")
    public void deleteUserById (@PathVariable("id") Integer id) {
        auctionService.deleteAuctionById(id);
    }

    @PutMapping("/auction")
    public Auction updateAuction(@RequestBody Auction auction){
        return auctionService.updateAuction(auction);
    }

}
