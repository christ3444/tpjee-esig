package org.esig.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
//@Data
//@AllArgsConstructor @NoArgsConstructor @ToString
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String adresse;
	private String telephone;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "stateid", insertable = false,
			updatable = false)
	private State state;
	private Integer stateid;
	@OneToMany
	private List<Vehicule> vehicules;
	
	public Client() {
	}
	
	public Client(String name, String adresse, String telephone, String email, State state, Integer stateid,
			List<Vehicule> vehicules) {
		super();
		this.name = name;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.state = state;
		this.stateid = stateid;
		this.vehicules = vehicules;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}


}
