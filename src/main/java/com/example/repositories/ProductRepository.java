package com.example.repositories;

import com.example.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findById(long id);
    Page<Product> findAll(Pageable pageable);
    List<Product> findByCategoryId(long categoryId);
    Page<Product> findByCategoryId(long categoryId, Pageable pageable);
}
