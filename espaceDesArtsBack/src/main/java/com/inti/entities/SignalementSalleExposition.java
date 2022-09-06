package com.inti.entities;

public class SignalementSalleExposition {
	private Long id;
	private String titre;
	private String description;
	
	public SignalementSalleExposition() {
		
	}

	public SignalementSalleExposition(Long id, String titre, String description) {
		this.id = id;
		this.titre = titre;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SignalementSalleExposition [id=" + id + ", titre=" + titre + ", description=" + description + "]";
	}
	
	
	
	
	
	

}
