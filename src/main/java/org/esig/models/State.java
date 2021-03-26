package org.esig.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Data
//@AllArgsConstructor @NoArgsConstructor @ToString
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "countryid", insertable = false,
			updatable = false)
	private Country country;
	
	public State() {
	}
	



	public State(String name, String code, Country country) {
		super();
		this.name = name;
		this.code = code;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCode() {
		return code;
	}




	public void setCode(String code) {
		this.code = code;
	}




	public Country getCountry() {
		return country;
	}




	public void setCountry(Country country) {
		this.country = country;
	}
	

}
