package com.example.demo.models;

import java.util.List;

public class Client {
	
	//champs
	private String nom;
	private String prenom;
	private int age;
	private int numero;
	private List<Compte> comptes;
	//constructeurs
	public Client() {
	}
	/**
	 * constructeur de clients avec ces parrametres
	 * @param nom du client
	 * @param prenom du client
	 * @param age du client
	 * @param numero du client
	 * @param compte liste de compte du client
	 */
	public Client(String nom, String prenom, int age, int numero, List<Compte> comptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		this.comptes = comptes;
	}
	//getteurs et setteurs
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Compte> getCompte() {
		return comptes;
	}
	public void setCompte(List<Compte> comptes) {
		this.comptes = comptes;
	}
	//methodes
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ comptes + "]";
	}

}
