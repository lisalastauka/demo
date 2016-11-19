package com.example.controllers;

import com.example.entities.Product;
import com.example.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

    private static final int PAGE_SIZE = 2;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    public ProductController (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @RequestMapping(value = "/product/", method = RequestMethod.GET)
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/product/", method = RequestMethod.POST)
    public List<Product> create(@RequestBody Product product){
        productRepository.save(product);
        return productRepository.findAll();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public List<Product> getById(@PathVariable long id){
        return productRepository.findById(id);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public List<Product> remove(@PathVariable long id){
        productRepository.delete(id);
        return productRepository.findAll();
    }

    @RequestMapping(value = "/product/category/{id}", method = RequestMethod.GET)
    public List<Product> getByCategory(@PathVariable long id){
        return productRepository.findByCategoryId(id);
    }

    @RequestMapping(value = "/product/category/{id}/page/{pageId}", method = RequestMethod.GET)
    public Page<Product> getByCategory(@PathVariable long id, @PathVariable int pageId){
        return productRepository.findByCategoryId(id, new PageRequest(pageId - 1, PAGE_SIZE));
    }

    @RequestMapping(value = "/product/page/{pageId}", method = RequestMethod.GET)
    public Page<Product> getAll(@PathVariable int pageId){
        return productRepository.findAll(new PageRequest(pageId - 1, PAGE_SIZE));
    }
}
