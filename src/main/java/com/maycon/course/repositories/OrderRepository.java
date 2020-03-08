package com.maycon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maycon.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
