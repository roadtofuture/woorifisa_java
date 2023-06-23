package com.example.demo.model.entity;

import com.example.demo.model.dto.CityDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private long id;
	@Column(columnDefinition = "char(35) not null default")
	private String name;
	@Column(columnDefinition = "char(20) not null default")
	private String district;
	private long population;
	
	//연관 객체의 로딩 시점을 필요한 시점으로 한다. 
	@ManyToOne(fetch = FetchType.LAZY) //시작하자마자 가져오는게 : EAGER, 필요할 때 가져와 : LAZY
	@JoinColumn(name="countrycode") //foreign key설정
	private Country countrycode; //country:연관관계의 객체 
	
	
	
	//entity to dto
	public CityDto toDto() {
		CityDto dto = new CityDto();
		dto.setId(this.getId());
		dto.setName(this.getName());
		dto.setDistrict(this.getDistrict());
		dto.setPopulation(this.getPopulation());
		dto.setCountryCode(this.countrycode.getCode());
		return dto;
	}
}
