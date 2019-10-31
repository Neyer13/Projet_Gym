package com.spring.demo.document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter@Document
public class Seance {
    
    @Field(value="IdSportifEntraineur")
    private Integer idSportifEntraineur;
    
    @Field(value="Jour")
    private String jour;
    
    @Field(value="Horaire")
    private int horaire;
    
    @Field(value="Duree")
    private int duree;
    
    @Field(value="Libelle")
    private String libelle;}
