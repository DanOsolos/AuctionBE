package com.sda.auction.exceptions;

import com.sda.auction.entities.Category;

public class CategoryNotFoundException extends Exception {
    public CategoryNotFoundException(String message) {
        super(message);
    }
}
