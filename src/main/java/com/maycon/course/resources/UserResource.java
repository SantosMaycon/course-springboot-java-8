package com.maycon.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maycon.course.entities.User;

@RestController @RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maycon", "mayconalves.santos14@gmail.com", "(22)997811790", "123");
		return ResponseEntity.ok().body(u);
	}
}
