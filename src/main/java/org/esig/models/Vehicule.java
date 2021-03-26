package org.esig.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Data
//@AllArgsConstructor @NoArgsConstructor @ToString
public class Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true)
	private String numeroMatricule;
	private String mark;
	private String modele;
	private String typeVehicule;
	@ManyToOne
	@JoinColumn(name = "clientid", insertable = false,
			updatable = false)
	private Client client;
	private Integer clientid;
	public Vehicule() {
		
	}
	public Vehicule(String numeroMatricule, String mark, String modele, String typeVehicule, Client client,
			Integer clientid) {
		super();
		this.numeroMatricule = numeroMatricule;
		this.mark = mark;
		this.modele = modele;
		this.typeVehicule = typeVehicule;
		this.client = client;
		this.clientid = clientid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroMatricule() {
		return numeroMatricule;
	}
	public void setNumeroMatricule(String numeroMatricule) {
		this.numeroMatricule = numeroMatricule;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getTypeVehicule() {
		return typeVehicule;
	}
	public void setTypeVehicule(String typeVehicule) {
		this.typeVehicule = typeVehicule;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Integer getClientid() {
		return clientid;
	}
	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}
	
	
	
	

}
