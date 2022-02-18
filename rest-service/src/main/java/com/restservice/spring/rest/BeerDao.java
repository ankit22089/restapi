package com.restservice.spring.rest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerDao extends JpaRepository<beer, Integer>{

}
