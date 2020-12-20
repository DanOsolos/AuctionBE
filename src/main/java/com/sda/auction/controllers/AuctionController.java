package com.sda.auction.controllers;

import com.sda.auction.services.AuctionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class AuctionController {

    private final AuctionService auctionService;

}