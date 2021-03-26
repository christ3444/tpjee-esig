package org.esig.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String code;
	
	@OneToMany(mappedBy = "country")
	private List<State> states;
	
	public Country() {
	}
	

	public Country(String name, String code, List<State> states) {
		super();
		this.name = name;
		this.code = code;
		this.states = states;
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


	public List<State> getStates() {
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}

}
