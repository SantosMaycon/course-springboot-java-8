package com.maycon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maycon.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
