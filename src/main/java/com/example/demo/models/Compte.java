package com.example.demo.models;

public class Compte {
	// champs
	private double solde;
	private int numero;

	// constructeurs
	public Compte() {
	}

	/**
	 * contructeur de compte avec son numero de compte et son solde en parrametre.
	 * 
	 * @param numero du compte
	 * @param solde  du compte
	 */
	public Compte(int numero, double solde) {
		this.solde = solde;
		this.numero = numero;
	}

	// getters et setters
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

	// methodes
	/**
	 * methode pour ajouter un montant au solde du compte
	 * 
	 * @param unMontant positif à ajouter au compte
	 */
	public void ajouter(double unMontant) {
		if (unMontant >= 0) {
			this.setSolde(this.getSolde() + unMontant);
		}
	}

	/**
	 * methode pour retirer un montant au solde du compte
	 * 
	 * @param unMontant positif à retirer.
	 */
	public void retirer(double unMontant) {
		if (unMontant >= 0) {
			this.setSolde(this.getSolde() + unMontant);
		}
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", numero=" + numero + "]";
	}

}
