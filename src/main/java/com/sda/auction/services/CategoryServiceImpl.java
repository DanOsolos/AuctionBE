package com.sda.auction.services;

import com.sda.auction.entities.Category;
import com.sda.auction.exceptions.AuctionNotFoundException;
import com.sda.auction.exceptions.CategoryNotFoundException;
import com.sda.auction.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Integer id) throws CategoryNotFoundException {
        return categoryRepository.findById(id).orElseThrow(()-> new CategoryNotFoundException("Could not find category"));
    }

    @Override
    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
}
