package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String name;
	private String cif;
	private String address;	
	private String email;
	private String website;
	private String phone1;
	private String phone2;
	
	
	
	
	
	
}
