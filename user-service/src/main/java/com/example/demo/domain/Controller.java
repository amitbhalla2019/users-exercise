package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("/users")
public class Controller {
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody User user) {
		repository.insert(user);
		return new ResponseEntity<>("User is created successfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}")
	public ResponseEntity<Optional<User>> getUser(@PathVariable("id") Long id) {
		if (!repository.existsById(id)) throw new UserNotFoundException();
		return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/all")
	public ResponseEntity<List<User>> getUsers() {
		if (repository.count()==0) throw new UserNotFoundException();
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}

	@RequestMapping
	public ResponseEntity<List<User>> getUserThruReqParamId(@RequestParam List<Long> ids) {
		List<User> users= (List<User>) repository.findAllById(ids);
		if (users.isEmpty()) throw new UserNotFoundException();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		if (!repository.existsById(user.getId())) throw new UserNotFoundException();
		repository.deleteById(user.getId());
		repository.insert(user);
		return new ResponseEntity<>("User is updated successsfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deleteParticularUser(@PathVariable("id") Long id) {
		if (!repository.existsById(id)) throw new UserNotFoundException();
		repository.deleteById(id);
		return new ResponseEntity<>("User is deleted successsfully", HttpStatus.OK);
	}

}