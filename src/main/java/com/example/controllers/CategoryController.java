package com.example.controllers;

import com.example.entities.Category;
import com.example.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/api/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryController (CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Category> create(@RequestBody Category category){
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<Category> getById(@PathVariable long id){
        return categoryRepository.findById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Category> remove(@PathVariable long id){
        categoryRepository.delete(id);
        return categoryRepository.findAll();
    }
}
