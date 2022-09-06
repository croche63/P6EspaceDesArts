package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Proprietaire;
import com.inti.service.interfaces.IProprietaireService;

@RestController
@CrossOrigin
public class ProprietaireController {
	@Autowired
	IProprietaireService ProprietaireService;

	@GetMapping("/Proprietaires")
	public List<Proprietaire> findAll() {
		return ProprietaireService.findAll();
	}

	@PostMapping("/Proprietaires")
	public Proprietaire saveProprietaire(@RequestBody Proprietaire Proprietaire) {
		return ProprietaireService.save(Proprietaire);
	}

	@DeleteMapping("/Proprietaires/{id}")
	public void deleteProprietaire(@PathVariable("id") Long id) {
		ProprietaireService.delete(id);
	}

}
