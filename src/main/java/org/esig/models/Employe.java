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
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String telephone;
	private String adresse;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "stateid", insertable = false,
			updatable = false)
	private State state;
	private Integer stateid;
	
	@ManyToOne
	@JoinColumn(name = "societeid", insertable = false,
			updatable = false)
	private Societe societe;
	private Integer societeid;
	
	public Employe() {
	}
	
	public Employe(String nom, String telephone, String adresse, String status, State state, Integer stateid,
			Societe societe, Integer societeid) {
		super();
		this.nom = nom;
		this.telephone = telephone;
		this.adresse = adresse;
		this.status = status;
		this.state = state;
		this.stateid = stateid;
		this.societe = societe;
		this.societeid = societeid;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public Integer getSocieteid() {
		return societeid;
	}

	public void setSocieteid(Integer societeid) {
		this.societeid = societeid;
	}



	
	
	

}
