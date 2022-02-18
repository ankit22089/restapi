package com.restservice.spring.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BeerController {

	@Autowired 
	BeerDao beerDao;
	
	@GetMapping("/home")
	public List<beer> getHome()
	{
		return beerDao.findAll();
	}
	
	@PostMapping("/home")
	public beer postHome(@RequestBody beer bee)
	{
		return beerDao.save(bee);
	}
	
	@DeleteMapping("/home/{id}")
	public String deleteHome(@PathVariable("id") int id)
	{
		beerDao.deleteById(id);
		return "deleted";
	}
}
