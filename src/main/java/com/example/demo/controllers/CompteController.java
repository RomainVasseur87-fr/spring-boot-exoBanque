package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Compte;


@RestController
@RequestMapping("Comptes")
public class CompteController {

	// fake base de données contenant des comptes
	private List<Compte> comptes = initComptes();

	/**
	 * methode qui creer et retourner une liste de compte
	 * 
	 * @return
	 */
	public List<Compte> initComptes() {
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(100001, 150000));
		comptes.add(new Compte(200002, 1503654120.25));
		comptes.add(new Compte(300003, 250));
		comptes.add(new Compte(400004, 3500));
		return comptes;
	}

	/**
	 * methode pour recuperer tout les comptes
	 * 
	 * @return la liste des comptes
	 */
	@GetMapping() // localhost:8080/Comptes
	public List<Compte> findAll() {
		return this.comptes;
	}

	// On fait un CRUD : creat, read, update, delete

	// correspond au read
	@GetMapping("/{numero}") // localhost:8080/comptes/un_numero_de_compte---->get
	public Compte findById(@PathVariable int numero) {
		Compte rechercheCompte = new Compte();
		for (Compte compte : comptes) {
			if (compte.getNumero() == numero) {
				rechercheCompte = compte;
			}
		}
		return rechercheCompte;

	}

	// correspond au creat
	@PostMapping() // localhost:8080/comptes----> post
	public Compte creat(@RequestBody Compte compte) {
		this.comptes.add(compte);
		return compte;
	}

	// correspond au update
	@PutMapping("/{id}") // localhost:8080/comptes/id---->put
	public Compte update(@PathVariable int id, @RequestBody Compte compte) {
		// recupere le compte correspondant à l'id
		Compte newCompte = findById(id);
		// modifie avec champs du nouveau user en body
		newCompte.setNumero(compte.getNumero());
		newCompte.setSolde(compte.getSolde());
		return newCompte;
	}

	// correspond au delete
	@DeleteMapping("/{id}") // localhost:8080/comptes/id---->delete
	public Compte delete(@PathVariable int id) {
		// recupere le compte correspondant à l'id
		Compte newCompte = findById(id);
		this.comptes.remove(id);
		return newCompte;
	}

}
