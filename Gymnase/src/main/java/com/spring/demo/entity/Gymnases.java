package com.spring.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Document(collection="Gymnases")
public class Gymnases {
	
	
	@Field(value = "_id")
	@Id
	private String idAdressGym;
	
	@Field(value = "IdGymnase")
	private Integer idGymnase;
	
	@Field(value = "nomGymnase")
	private String nomGymnase;
	
	@Field(value = "Adresse")
	private String adresse;
	
	@Field(value = "Ville")
	private String ville;
	
	@Field(value = "Surface")
	private int surface;
	
	@Field(value = "Seances")
	private Seance seances;
}
