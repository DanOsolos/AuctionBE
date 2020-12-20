package com.sda.auction.services;

import com.sda.auction.entities.Category;
import com.sda.auction.exceptions.CategoryNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> findAllCategories();
    void createCategory (Category category);
    Category getCategoryById (Integer id) throws CategoryNotFoundException;
    void deleteCategoryById(Integer id);
    Category updateCategory (Category category);
}
