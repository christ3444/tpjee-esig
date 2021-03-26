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
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ville;
	private String numeroRue;
	
	@ManyToOne
	@JoinColumn(name = "stateid",insertable = false,
			updatable = false)
	 private State state;
	
	public Location() {
	}
	

	public Location(String ville, String numeroRue, State state) {
		super();
		this.ville = ville;
		this.numeroRue = numeroRue;
		this.state = state;
	}
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getNumeroRue() {
		return numeroRue;
	}


	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}

}
