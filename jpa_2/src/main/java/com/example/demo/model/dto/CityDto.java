package com.example.demo.model.dto;

import com.example.demo.model.entity.City;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Dto: Data Transfer Object 데이터를 전달하기 위한 객체 
public class CityDto {

	
	private long id;
	private String name;
	private String district;
	private long population;
	private String countryCode;
	
	//DTO -> entity
	public City toEntity() {
		City city = new City();
		city.setId(this.getId());
		city.setName(this.getName());
		city.setDistrict(this.getDistrict());
		city.setPopulation(this.getPopulation());
		return city;
	}

}
