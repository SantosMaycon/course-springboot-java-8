package com.maycon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maycon.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
