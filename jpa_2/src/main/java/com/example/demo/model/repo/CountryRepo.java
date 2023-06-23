package com.example.demo.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Country;

public interface CountryRepo extends JpaRepository<Country, String>{

}
