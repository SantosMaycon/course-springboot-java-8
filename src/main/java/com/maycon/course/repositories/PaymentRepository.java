package com.maycon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maycon.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
