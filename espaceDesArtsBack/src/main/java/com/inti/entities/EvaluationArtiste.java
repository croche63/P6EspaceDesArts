package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class EvaluationArtiste implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Titre;
	private String Description;
	private int Note;
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.DATE)
	private Date date;

	@OneToMany(mappedBy = "evaluationArtiste")
	private SalleExposition SalleExposition;

	@ManyToOne
	private Artiste Artiste;

	public EvaluationArtiste() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getNote() {
		return Note;
	}

	public void setNote(int note) {
		Note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SalleExposition getSalleExposition() {
		return SalleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		SalleExposition = salleExposition;
	}

	public Artiste getArtiste() {
		return Artiste;
	}

	public void setArtiste(Artiste artiste) {
		Artiste = artiste;
	}

	@Override
	public String toString() {
		return "EvaluationArtiste [Id=" + Id + ", Titre=" + Titre + ", Description=" + Description + ", Note=" + Note
				+ ", date=" + date + ", SalleExposition=" + SalleExposition + ", Artiste=" + Artiste + "]";
	}

}
