package com.example.demo.models;

public class CompteRemunere extends Compte {
	// champs
	private double taux;

	// constructeur
	public CompteRemunere() {
	}

	/**
	 * constructeur de compteRemunere avec ces parrametres
	 * 
	 * @param numero du compte
	 * @param solde  du compte
	 * @param taux   de remuneration du compte
	 */
	public CompteRemunere(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}
	
	//getters et setters
	public double getTaux() {
		return taux;
	}

	//le taux doit etre entre 0 et 1.
	public void setTaux(double taux) {
		if (taux <=1 && taux >=0) {
			this.taux = taux;
		}else {
			throw new RuntimeException("le taux doit etre entre 0 et 1");
		}
	}

	@Override
	public String toString() {
		return "CompteRemunere [taux=" + taux + "]";
	}

}
