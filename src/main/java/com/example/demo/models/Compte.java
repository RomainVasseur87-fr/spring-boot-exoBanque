package com.example.demo.models;

public class Compte {
	//champs
	private double solde;
	private int numero;
	//constructeurs
	public Compte() {
	}
	/**
	 * contructeur de compte avec son numero de compte et son solde en parrametre.
	 * @param numero du compte
	 * @param solde du compte
	 */
	public Compte(int numero, double solde) {
		this.solde = solde;
		this.numero = numero;
	}
	//getters et setters
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", numero=" + numero + "]";
	}
	
	

}
