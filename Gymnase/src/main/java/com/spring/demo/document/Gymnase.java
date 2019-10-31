package com.spring.demo.document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@org.springframework.data.mongodb.core.mapping.Document(collection = "Gymnases")
public class Gymnase {
	 
	    @Id
	    private Long id;
	 
	    @Indexed(unique = true)
	    @Field(value = "IdGymnase")
	    private String idGymnase;
	    
	    @Field(value = "NomGymnase")
	    private String nomGymnase;
	    
	    @Field(value = "Adresse")
	    private String adresse;
	    
	    @Field(value = "Ville")
	    private String ville;
	    
	    @Field(value = "Surface")
	    private String surface;
	    
	    @Field(value = "Seances")
	    private String seances;	    
	    
}
