package com.starter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Product {

	@NonNull
	@Id
	@GeneratedValue
	private Integer prodId;
	@NonNull
	private String prodCode;
	@NonNull
	private Double prodCoast;
	
	public Product(String prodCode,Double prodCoast) {
		this.prodCode = prodCode;
		this.prodCoast = prodCoast;
	}
	
}
