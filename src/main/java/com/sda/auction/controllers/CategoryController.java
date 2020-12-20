package com.sda.auction.controllers;

import com.sda.auction.entities.Category;
import com.sda.auction.exceptions.CategoryNotFoundException;
import com.sda.auction.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class CategoryController {

    private final CategoryService categoryService;
    private static final String PATH = "/category";

    @GetMapping("/categories")
    public List<Category> findAllCategories(){
        return categoryService.findAllCategories();
    }

    @GetMapping(PATH + "/{id}")
    public Category getCategoryById (@PathVariable("id") Integer id) throws CategoryNotFoundException {
        return categoryService.getCategoryById(id);
    }

    @PostMapping(PATH)
    public void createCategory (@RequestBody Category category){
        categoryService.createCategory(category);
    }

    @DeleteMapping(PATH + "/{id}")
    public void deleteCategoryById (@PathVariable("id") Integer id) {
        categoryService.deleteCategoryById(id);
    }

    @PutMapping(PATH)
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

}
