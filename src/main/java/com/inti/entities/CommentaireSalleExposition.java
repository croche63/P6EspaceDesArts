package com.inti.entities;

public class CommentaireSalleExposition {
	private Long id;
	private String titre;
	private String description;
	private int note;
	
	public CommentaireSalleExposition() {
		
	}

	public CommentaireSalleExposition(Long id, String titre, String description, int note) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.note = note;
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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "CommentaireSalleExposition [id=" + id + ", titre=" + titre + ", description=" + description + ", note="
				+ note + "]";
	}
	
	
	
	

}
